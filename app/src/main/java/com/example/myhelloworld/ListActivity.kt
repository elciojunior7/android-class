package com.example.myhelloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.myhelloworld.db.Pais
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.activity_main.*

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val brasil = Pais(id = 1, nome = "Brasil", slogan = "País tropical", descricao = "Não é para iniciantes")
        val argentina = Pais(id = 2, nome = "Argentina", slogan = "País do tango", descricao = "Pele > maradona")
        val paraguai = Pais(id = 3, nome = "Paraguai", slogan = "País da muamba", descricao = "Uma loucura")

        val paises = arrayOf(brasil, argentina, paraguai)

        lista.adapter = PaisAdapter(applicationContext, paises, assets)
            //ArrayAdapter<Pais>(this, android.R.layout.simple_list_item_1, paises)

        lista.setOnItemClickListener(AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Item Clicado : $position", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@ListActivity, DetailActivity::class.java)
            intent.putExtra("pais", paises[position])
            startActivity(intent)
        })
    }
}