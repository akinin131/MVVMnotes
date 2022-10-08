package quiz.example.notesapp.database.room.AppRoomDatabase

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import quiz.example.notesapp.database.room.dao.NoteRoomDao
import quiz.example.notesapp.model.Note

@Database(entities = [Note::class], version = 1)
abstract class AppRoomDatabase : RoomDatabase(){
    abstract fun getDao(): NoteRoomDao

    companion object{
        @Volatile
        private var INSTANCE:AppRoomDatabase?=null
        fun getInstanse(context: Context):AppRoomDatabase{
            return if(INSTANCE == null){
                INSTANCE =Room.databaseBuilder(
                    context,
                    AppRoomDatabase::class.java,"Notes_database"
                ).build()
                INSTANCE as AppRoomDatabase
            }else INSTANCE as AppRoomDatabase
        }
    }
}