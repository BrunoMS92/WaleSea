package br.com.walesea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaLoja : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_loja)

        getSupportActionBar()!!?.hide()
    }
}