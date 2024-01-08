package com.marcr.cafeteriaaplicaciomarcrubio.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marcr.aplicaciologinbdmarcrubio.AccountProvider

class ActvLoginViewModel : ViewModel() {

    private val _user = MutableLiveData<String>()
    val user: LiveData<String> = _user

    fun verifyUser(user: String, password: String): Boolean {
        val accountModel = AccountProvider.getUser(user.toString())

        if (accountModel != null && accountModel.password == password.toString()) {
            _user.value = accountModel.user
            return true
        }
        else{
            return false
        }
    }
}