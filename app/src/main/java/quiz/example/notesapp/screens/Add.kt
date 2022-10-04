package quiz.example.notesapp.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material.*

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import quiz.example.notesapp.navigation.NavRout

@Composable
fun Add(navController: NavHostController) {
    var title by remember { mutableStateOf("") }
    var subtitle by remember { mutableStateOf("") }
    Scaffold {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
        {
            Text(text = "Добавить новую задачу",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 8.dp))
            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                textStyle = MaterialTheme.typography.h5,
                label = { Text(text = "Text") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            )
            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                textStyle = MaterialTheme.typography.h5,
                label = { Text(text = "Text") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            )
            Button(onClick = { navController.navigate(route = NavRout.Main.route) },
                modifier = Modifier
                    .width(200.dp)
                    .padding(vertical = 22.dp)) {
                Text(text = "Добавить задачу")
            }

        }

    }

}




