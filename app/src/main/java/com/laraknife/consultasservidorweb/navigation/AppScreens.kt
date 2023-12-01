package com.laraknife.consultasservidorweb.navigation

sealed class AppScreens(val route: String) {
    object Consultas : AppScreens("consultas")

    object Login : AppScreens("login")

    object SingUp : AppScreens("singup")

    object Consult : AppScreens("consult")

    object Modify : AppScreens("modify")

    object Delete : AppScreens("delete")
}
