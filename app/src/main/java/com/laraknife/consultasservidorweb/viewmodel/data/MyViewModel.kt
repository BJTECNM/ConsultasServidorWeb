package com.laraknife.consultasservidorweb.viewmodel.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.laraknife.consultasservidorweb.retrofit.data.Datos
import com.laraknife.consultasservidorweb.retrofit.data.RetrofitClient
import com.laraknife.consultasservidorweb.retrofit.data.ServerResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class MyViewModel : ViewModel() {
    // Instancias de Retrofit
    private val retrofit = RetrofitClient.getInstance()

    // Variable de apoyo en caso de error
    private val _error = MutableLiveData<Boolean>()
    val error: LiveData<Boolean> = _error

    // Variables empleadas por la aplicación
    private val _user = MutableLiveData<String>()
    val user: LiveData<String> = _user

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    private val _passwordConfirm = MutableLiveData<String>()
    val passwordConfirm: LiveData<String> = _passwordConfirm

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _firstSurname = MutableLiveData<String>()
    val firstSurname: LiveData<String> = _firstSurname

    private val _secondSurname = MutableLiveData<String>()
    val secondSurname: LiveData<String> = _secondSurname

    // Funciones de comunicación con el servidor empleando Retrofit
    fun Login() {

    }

    fun Consult() {

    }

    fun Modify() {

    }

    fun Delete() {

    }

    fun SingUp() {

    }

    // Funciones para modificar los valores de las variables
    fun ResetValues() {
        _user.value = ""
        _password.value = ""
        _passwordConfirm.value = ""
        _name.value = ""
        _firstSurname.value = ""
        _secondSurname.value = ""
    }

    fun ModifyUser(valor: String) {
        _user.value = valor
    }

    fun ModifyPassword(valor: String) {
        _password.value = valor
    }

    fun ModifyPasswordConfirm(valor: String) {
        _passwordConfirm.value = valor
    }

    fun ModifyName(valor: String) {
        _name.value = valor
    }

    fun ModifyFirstSurname(valor: String) {
        _firstSurname.value = valor
    }

    fun ModifySecondSurname(valor: String) {
        _secondSurname.value = valor
    }

    fun CallServer() {
        val datos = Datos(
            user = user.value!!,
            password = password.value!!,
            name = name.value!!,
            firstSurname = firstSurname.value!!,
            secondSurname = secondSurname.value!!
        )

        CoroutineScope(Dispatchers.IO).launch {
            val deferred = async { retrofit.callServer(post = datos) }
            val response: Response<ServerResponse> = deferred.await()

            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    // Se recibe la respuesta del servidor
                    //_resultado.value = response.body()?.valor.toString()
                } else {
                    _error.value = true
                }
            }
        }
    }
}