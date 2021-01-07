package com.example.myhelloworld

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.myhelloworld.db.Pais
import kotlinx.android.synthetic.main.activity_row_list.view.*

class PaisAdapter(context: Context, paises: Array<Pais>) : BaseAdapter() {

    private var paises: Array<Pais>
    private var inflator: LayoutInflater

    init{
        this.paises = paises
        this.inflator = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val pais = this.paises[position]
        val view = this.inflator.inflate(R.layout.activity_row_list, parent, false)
        view.nome.text = pais.nome
        view.slogan.text = pais.slogan
        return view
    }

    override fun getItem(position: Int): Any {
        return this.paises[position]
    }

    override fun getItemId(position: Int): Long {
        return this.paises[position].id
    }

    override fun getCount(): Int {
        return this.paises.size
    }
}