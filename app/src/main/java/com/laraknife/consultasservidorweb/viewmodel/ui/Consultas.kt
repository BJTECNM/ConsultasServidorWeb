package com.laraknife.consultasservidorweb.viewmodel.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.laraknife.consultasservidorweb.viewmodel.data.MyViewModel
import com.laraknife.consultasservidorweb.navigation.AppScreens

@Composable
fun Consultas(myViewModel: MyViewModel, navController: NavController) {
    // Reinicio de los valores almacenados
    myViewModel.ResetValues()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 36.dp, end = 36.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Operaciones disponibles",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Space()

        Button(
            onClick = { navController.navigate(route = AppScreens.Login.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Ingresar",
                fontSize = 18.sp,
                modifier = Modifier.padding(4.dp)
            )
        }

        Space()

        Button(
            onClick = { navController.navigate(route = AppScreens.Consult.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Consultar",
                fontSize = 18.sp,
                modifier = Modifier.padding(4.dp)
            )
        }

        Space()

        Button(
            onClick = { navController.navigate(route = AppScreens.Modify.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Modificar",
                fontSize = 18.sp,
                modifier = Modifier.padding(4.dp)
            )
        }

        Space()

        Button(
            onClick = { navController.navigate(route = AppScreens.Delete.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Eliminar",
                fontSize = 18.sp,
                modifier = Modifier.padding(4.dp)
            )
        }

        Space()

        Button(
            onClick = { navController.navigate(route = AppScreens.SingUp.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Registrar",
                fontSize = 18.sp,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.padding(16.dp))
}