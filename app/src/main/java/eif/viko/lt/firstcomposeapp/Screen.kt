package eif.viko.lt.firstcomposeapp

sealed class Screen(val route: String){
    object MainScreen: Screen("main")
    object DetailScreen : Screen("detail")

    fun withArgs(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach { arg->
                append("/$arg")
            }
        }
    }

}
