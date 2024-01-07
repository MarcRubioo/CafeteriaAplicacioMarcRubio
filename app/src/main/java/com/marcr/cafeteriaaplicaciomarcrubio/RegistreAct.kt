package com.marcr.cafeteriaaplicaciomarcrubio

import ActvLoginViewModel
import ActvRegistreViewModel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.marcr.cafeteriaaplicaciomarcrubio.databinding.ActivityMainBinding
import com.marcr.cafeteriaaplicaciomarcrubio.databinding.ActivityRegistreBinding

class RegistreAct : AppCompatActivity() {

    private val viewModel: ActvRegistreViewModel by viewModels()
    private lateinit var binding: ActivityRegistreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registre)

        val intent = Intent(this, LoginAct::class.java)

        binding = ActivityRegistreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistre.setOnClickListener {
            val user= binding.editTextUserReg.text.toString()
            val pass= binding.editTextPasswordReg.text.toString()

            if (user.isNotBlank() && pass.isNotBlank()) {
                val comprovacio = viewModel.createUser(user, pass)
                Toast.makeText(binding.root.context, "Usuari creat!", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            } else {
                Toast.makeText(binding.root.context, "Introdueix els dos camps", Toast.LENGTH_SHORT).show()
            }
        }
    }
}