package br.com.walesea

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.walesea.databinding.ActivityTelaCadastroBinding

class TelaCadastro : AppCompatActivity() {

    private lateinit var binding: ActivityTelaCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)



        getSupportActionBar()!!?.hide()
    }
}