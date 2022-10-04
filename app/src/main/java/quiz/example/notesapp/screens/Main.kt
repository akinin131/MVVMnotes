package quiz.example.notesapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import quiz.example.notesapp.navigation.NavRout
import quiz.example.notesapp.ui.theme.NotesAppTheme

@Composable
fun Main(navController: NavHostController) {

    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = { navController.navigate(NavRout.Add.route) }) {
            Icon(imageVector = Icons.Filled.Add,
                contentDescription = "Add icons",
                tint = Color.White)

        }
    })
    {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
            NoteItem(title = "Porno", subTitle = "Sex", navController = navController)
        }

    }
}

@Composable
fun NoteItem(title: String, subTitle: String, navController: NavHostController) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp, horizontal = 4.dp)
        .clickable { navController.navigate(NavRout.Note.route) },
        elevation = 3.dp

    ) {
        Column(modifier = Modifier.padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = title, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(text = subTitle)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    NotesAppTheme {
        Main(navController = rememberNavController())
    }
}