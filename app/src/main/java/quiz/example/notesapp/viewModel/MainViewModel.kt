package quiz.example.notesapp.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import quiz.example.notesapp.model.Note
import quiz.example.notesapp.utils.TYPE_FIREBASE
import quiz.example.notesapp.utils.TYPE_ROOM

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val readTest: MutableLiveData<List<Note>> by lazy { MutableLiveData<List<Note>>() }
    val dbType: MutableLiveData<String> by lazy { MutableLiveData<String>(TYPE_ROOM) }

    init {
        readTest.value = when(dbType.value){
            TYPE_ROOM ->{
                listOf<Note>(
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),
                    Note(title = "var 1", subtitle = "var2"),

                )
            }
            TYPE_FIREBASE -> listOf<Note>()
            else -> listOf()

        }
    }



    fun initDatabase(type: String) {
        dbType.value = type

    }
}