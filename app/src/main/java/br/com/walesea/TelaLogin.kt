package br.com.walesea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import br.com.walesea.databinding.ActivityTelaCadastroBinding
import br.com.walesea.databinding.ActivityTelaLoginBinding

class TelaLogin : AppCompatActivity() {

    private lateinit var binding: ActivityTelaLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.txtIrTelaCadastrar.text="Crie uma conta Clicando Aqui !"


        getSupportActionBar()!!?.hide()
    }
}