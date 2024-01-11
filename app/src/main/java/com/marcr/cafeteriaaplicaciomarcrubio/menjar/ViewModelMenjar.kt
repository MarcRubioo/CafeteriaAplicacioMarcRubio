package com.marcr.cafeteriaaplicaciomarcrubio.menjar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelMenjar : ViewModel() {

    private val _menjar = MutableLiveData<List<Menjar>>()
    val menjar: LiveData<List<Menjar>> = _menjar

    fun cargarMenjar(){
        _menjar.value = MenjarProvider.menjarList
    }
}