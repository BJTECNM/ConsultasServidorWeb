package com.laraknife.consultasservidorweb.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.laraknife.consultasservidorweb.viewmodel.data.MyViewModel
import com.laraknife.consultasservidorweb.viewmodel.ui.Consult
import com.laraknife.consultasservidorweb.viewmodel.ui.Consultas
import com.laraknife.consultasservidorweb.viewmodel.ui.Delete
import com.laraknife.consultasservidorweb.viewmodel.ui.Login
import com.laraknife.consultasservidorweb.viewmodel.ui.Modify
import com.laraknife.consultasservidorweb.viewmodel.ui.SingUp

@Composable
fun AppNavigation(myViewModel: MyViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.Consultas.route) {
        composable(route = AppScreens.Consultas.route) {
            Consultas(myViewModel = myViewModel, navController)
        }

        composable(route = AppScreens.Login.route) {
            Login(myViewModel = myViewModel, navController)
        }

        composable(route = AppScreens.SingUp.route) {
            SingUp(myViewModel = myViewModel, navController)
        }

        composable(route = AppScreens.Consult.route) {
            Consult(myViewModel = myViewModel, navController)
        }

        composable(route = AppScreens.Modify.route) {
            Modify(myViewModel = myViewModel, navController = navController)
        }

        composable(route = AppScreens.Delete.route) {
            Delete(myViewModel = myViewModel, navController = navController)
        }
    }
}