package eif.viko.lt.firstcomposeapp

sealed class Screen(val route: String){
    object Main: Screen("main")
    object Details : Screen("details")

    fun withArgs(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach { arg->
                append("/${arg}")
            }
        }
    }

}
