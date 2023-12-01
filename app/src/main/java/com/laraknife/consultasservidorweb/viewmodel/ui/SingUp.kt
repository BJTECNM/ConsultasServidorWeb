package com.laraknife.consultasservidorweb.viewmodel.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.laraknife.consultasservidorweb.viewmodel.data.MyViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SingUp(myViewModel: MyViewModel, navController: NavController) {
    val user: String by myViewModel.user.observeAsState(initial = "")
    val password: String by myViewModel.password.observeAsState(initial = "")
    val passwordConfirm: String by myViewModel.passwordConfirm.observeAsState(initial = "")
    val name: String by myViewModel.name.observeAsState(initial = "")
    val firstSurname: String by myViewModel.firstSurname.observeAsState(initial = "")
    val secondSurname: String by myViewModel.secondSurname.observeAsState(initial = "")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Space()

        Text(
            text = "Registro",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Space()

        OutlinedTextField(
            value = user,
            onValueChange = { myViewModel.ModifyUser(it) },
            label = {
                Text(text = "Usuario: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = name,
            onValueChange = { myViewModel.ModifyName(it) },
            label = {
                Text(text = "Nombre: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = firstSurname,
            onValueChange = { myViewModel.ModifyFirstSurname(it) },
            label = {
                Text(text = "Primer apellido: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = secondSurname,
            onValueChange = { myViewModel.ModifySecondSurname(it) },
            label = {
                Text(text = "Segundo apellido (Opcional): ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = password,
            onValueChange = { myViewModel.ModifyPassword(it) },
            label = {
                Text(text = "Contraseña: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()
        )

        OutlinedTextField(
            value = passwordConfirm,
            onValueChange = { myViewModel.ModifyPasswordConfirm(it) },
            label = {
                Text(text = "Confirmar Contraseña: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()
        )

        Space()

        Button(
            onClick = { myViewModel.SingUp() },
            Modifier
                .fillMaxWidth()
                .padding(start = 36.dp, end = 36.dp)
        ) {
            Text(
                text = "Registrarse",
                fontSize = 18.sp,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}