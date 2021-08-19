package eif.viko.lt.firstcomposeapp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    var text by remember { mutableStateOf("") }
    var isError by rememberSaveable { mutableStateOf(true) }

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        TextField(
            value = text,
            onValueChange = {
                text = it
                isError = text.count() < 3
            },
            trailingIcon = {
                if (isError)
                    Icon(
                        Icons.Filled.Info,
                        "error",
                        tint = MaterialTheme.colors.error
                    )
            },
            singleLine = true,
            isError = isError,
            modifier = Modifier.fillMaxWidth()
        )
        if (isError) {
            Text(
                text = "Enter name min length 3 symbols",
                color = MaterialTheme.colors.error,
                style = MaterialTheme.typography.caption,
                modifier = Modifier.padding(start = 16.dp)
            )
        }else{
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { navController.navigate(Screen.Details.withArgs(text)) },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(text = "To DetailScreen")
            }
        }

    }
}
