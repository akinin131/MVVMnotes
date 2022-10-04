package quiz.example.notesapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import quiz.example.notesapp.screens.Add
import quiz.example.notesapp.screens.Main
import quiz.example.notesapp.screens.Note
import quiz.example.notesapp.screens.Start

sealed class NavRout(val route: String){
    object Start: NavRout("start_screen")
    object Main: NavRout("main_screen")
    object Add: NavRout("add_screen")
    object Note: NavRout("note_screen")

}

@Composable
fun NotesNavHost(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRout.Start.route){
        composable(NavRout.Start.route){ Start(navController=navController) }
        composable(NavRout.Main.route){ Main(navController=navController) }
        composable(NavRout.Add.route){ Add(navController=navController) }
        composable(NavRout.Note.route){ Note(navController=navController) }
    }

}
   

