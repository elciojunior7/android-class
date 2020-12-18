package com.example.myhelloworld

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_game.*

class GameMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_game)

        brasilScore.setOnClickListener{

            val gol = Integer.parseInt(mandantePlacar.text.toString()) + 1
            mandantePlacar.setText(gol.toString())
        }

        alemanhaScore.setOnClickListener{

            val gol = Integer.parseInt(visitantePlacar.text.toString()) + 1
            visitantePlacar.setText(gol.toString())
        }

        // Logger.getLogger(MainActivity::class.java.name).info("Ola Log Cat")
        Log.i("Mobile" , "Ola LogCat");

    }
}