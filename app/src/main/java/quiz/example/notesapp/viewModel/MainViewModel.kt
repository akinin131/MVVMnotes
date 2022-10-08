package quiz.example.notesapp.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import quiz.example.notesapp.database.room.AppRoomDatabase.AppRoomDatabase
import quiz.example.notesapp.database.room.repository.RoomRepository
import quiz.example.notesapp.model.Note
import quiz.example.notesapp.utils.REPOSITORY
import quiz.example.notesapp.utils.TYPE_FIREBASE
import quiz.example.notesapp.utils.TYPE_ROOM

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val context = application

    fun initDatabase(type: String, onSuccess:()->Unit) {
        when(type){
            TYPE_ROOM ->{
                val dao = AppRoomDatabase.getInstanse(context = context).getDao()
                REPOSITORY = RoomRepository(dao)
                onSuccess()
            }
        }

    }
}