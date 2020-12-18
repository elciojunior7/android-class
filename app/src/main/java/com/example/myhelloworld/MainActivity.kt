package com.example.myhelloworld

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculo.setOnClickListener{
            val intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putExtra("gasolina", inputGasolina.text.toString())
            intent.putExtra("alcool", inputAlcool.text.toString())
            startActivity(intent)
        }

        url.setOnClickListener{
            val uri = Uri.parse("http://www.uol.com.br")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        ligar.setOnClickListener{
            val uri = Uri.parse("tel:999999999")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        // Logger.getLogger(MainActivity::class.java.name).info("Ola Log Cat")
        Log.i("Mobile" , "Ola LogCat");

    }
}