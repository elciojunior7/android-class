package com.example.myhelloworld

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.myhelloworld.db.Pais
import kotlinx.android.synthetic.main.activity_selected_country.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val paiss = intent?.getSerializableExtra("pais") as Pais
        pais.text = paiss.nome
    }
}