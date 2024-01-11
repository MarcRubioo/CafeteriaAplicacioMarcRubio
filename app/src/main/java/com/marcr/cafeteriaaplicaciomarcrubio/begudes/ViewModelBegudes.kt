package com.marcr.cafeteriaaplicaciomarcrubio.begudes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marcr.cafeteriaaplicaciomarcrubio.menjar.Menjar
import com.marcr.cafeteriaaplicaciomarcrubio.menjar.MenjarProvider

class ViewModelBegudes : ViewModel() {

    private val _begudes = MutableLiveData<List<Begudes>>()
    val begudes: LiveData<List<Begudes>> = _begudes

    fun cargarBegudes(){
        _begudes.value = BegudesProvider.begudesList
    }
}