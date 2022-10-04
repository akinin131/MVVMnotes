package quiz.example.notesapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.intellij.lang.annotations.JdkConstants
import quiz.example.notesapp.navigation.NavRout
import quiz.example.notesapp.ui.theme.NotesAppTheme

@Composable
fun Start(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(text = "Что мы будем изпользовать?")
            Button(onClick = { navController.navigate(route = NavRout.Main.route) },
                modifier = Modifier
                    .width(200.dp)
                    .padding(vertical = 22.dp)) {
                Text(text = "Room DataBase")
            }
            Button(onClick = { navController.navigate(route = NavRout.Main.route) },
                modifier = Modifier
                    .width(200.dp)
                    .padding(vertical = 2.dp)) {
                Text(text = "Room DataBase")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevStartScreen() {
    NotesAppTheme {
        Start(navController = rememberNavController())
    }
}