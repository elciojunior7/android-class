package com.example.myhelloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_result)

        val gasolina = intent?.getStringExtra("gasolina")?.toDoubleOrNull()
        val alcool = intent?.getStringExtra("alcool")?.toDoubleOrNull()

        if(gasolina != null && alcool != null) {
            val comparacao = gasolina * 0.7
            if(comparacao > alcool) {
                resultado.text = "Alcool"
            }else {
                resultado.text = "Gasolina"
            }
        }else{
            resultado.text = "Sem resultado"
        }
    }
}