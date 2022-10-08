package quiz.example.notesapp.viewModel


import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider



class ResultViewModelFactory (private val application: Application) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(application=application) as T
        }
        throw IllegalArgumentException("dsfsdfsdf")
    }
}


