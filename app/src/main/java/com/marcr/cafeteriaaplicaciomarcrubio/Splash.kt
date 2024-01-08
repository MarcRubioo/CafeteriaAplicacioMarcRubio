package com.marcr.cafeteriaaplicaciomarcrubio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marcr.cafeteriaaplicaciomarcrubio.login.LoginAct

class Splash: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, LoginAct::class.java))
    }
}