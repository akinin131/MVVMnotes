package quiz.example.notesapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import quiz.example.notesapp.navigation.NotesNavHost
import quiz.example.notesapp.ui.theme.NotesAppTheme
import androidx.compose.ui.Modifier
import java.nio.file.Files.size

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesAppTheme{
//                Scaffold (
//                    topBar = {
//                        TopAppBar(
//                            title = { Text(text = "fege jknj") },
//                            backgroundColor = Color.Blue,
//                            contentColor = Color.Black,
//                            elevation = 12.dp) },
//                    content = {
//                        Surface(
//                            modifier = Modifier.fillMaxSize(),
//                            color = MaterialTheme.colors.background
//                        ) {
//                            NotesNavHost()
//                        }
//                    }
//                )

                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "cevwe")},
                            backgroundColor = Color.Blue,
                            contentColor = Color.White,
                            elevation = 12.dp)},
                    content = {
                            Surface(modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colors.background) {
                                NotesNavHost()
                        }
                    }
                )

            }
        }
    }

    @Composable
    fun DefaultPreview() {
        NotesAppTheme {

        }
    }


}


