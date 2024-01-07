package com.marcr.cafeteriaaplicaciomarcrubio

import ActvLoginViewModel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.marcr.cafeteriaaplicaciomarcrubio.databinding.ActivityMainBinding

class LoginAct : AppCompatActivity() {

    private val viewModel: ActvLoginViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentRegistre = Intent(this, RegistreAct::class.java)
        val intentCataleg = Intent(this, ActivityFrgaments::class.java)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewCrearCompte.setOnClickListener {
            startActivity(intentRegistre)
        }

        binding.btnLoginNext.setOnClickListener{

            val user= binding.editTextUser.text.toString()
            val pass= binding.editTextPassword.text.toString()

            val comprovacio= viewModel.verifyUser(user,pass)

            if (comprovacio){
                startActivity(intentCataleg)
            }
            else {
                Toast.makeText(binding.root.context, "Credencials Incorrectes!!! ", Toast.LENGTH_SHORT).show()
            }
        }
    }
}