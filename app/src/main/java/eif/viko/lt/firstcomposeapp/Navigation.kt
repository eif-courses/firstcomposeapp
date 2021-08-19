package eif.viko.lt.firstcomposeapp

import androidx.compose.runtime.*
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import eif.viko.lt.firstcomposeapp.ui.theme.DetailsScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(route = Screen.Main.route) {
            MainScreen(navController = navController)
        }
        composable(route = "${Screen.Details.route}/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    nullable = true
                    defaultValue = "Nenurodei vardo"
                }
            )) { entry ->
            DetailsScreen(name = entry.arguments?.getString("name", "Nenurodytas vardas"))
        }

    }
}