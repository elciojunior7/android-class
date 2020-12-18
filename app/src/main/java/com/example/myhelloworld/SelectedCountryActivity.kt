package com.example.myhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_result.*
import kotlinx.android.synthetic.main.activity_selected_country.*

class SelectedCountryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_country)

        val paiss = intent?.getStringExtra("pais")
        pais.text = paiss
    }
}