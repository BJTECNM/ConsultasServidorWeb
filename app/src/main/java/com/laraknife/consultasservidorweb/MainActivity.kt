package com.laraknife.consultasservidorweb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.laraknife.consultasservidorweb.ui.theme.ConsultasServidorWebTheme
import com.laraknife.consultasservidorweb.viewmodel.data.MyViewModel
import com.laraknife.consultasservidorweb.navigation.AppNavigation

class MainActivity : ComponentActivity() {

    /*
    Hecho por Brayan Josue Hernández Lara (LaraKnife)
    Ingeniería en Sistemas Computacionales
    Número de control: 192T0220
    Materia: Programación web
    Noviembre de 2023
    Noveno Semestre
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConsultasServidorWebTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation(myViewModel = MyViewModel())
                }
            }
        }
    }
}
