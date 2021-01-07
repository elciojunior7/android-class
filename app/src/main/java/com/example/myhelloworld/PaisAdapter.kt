package com.example.myhelloworld

import android.content.Context
import android.content.res.AssetManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.myhelloworld.db.Pais
import kotlinx.android.synthetic.main.activity_row_list.view.*
import java.io.IOException
import java.io.InputStream

class PaisAdapter(context: Context, paises: Array<Pais>, assetManager: AssetManager) : BaseAdapter() {

    private var paises: Array<Pais>
    private var inflator: LayoutInflater
    private var assetManager: AssetManager

    init{
        this.paises = paises
        this.inflator = LayoutInflater.from(context)
        this.assetManager = assetManager
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val pais = this.paises[position]
        val view = this.inflator.inflate(R.layout.activity_row_list, parent, false)
        val img = this.getBitmapFromAsset(pais.id)
        view.foto.setImageBitmap(img)
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

    private fun getBitmapFromAsset(id: Long): Bitmap {
        val assetManager = this.assetManager
        var istr: InputStream? = null
        try{
            istr = assetManager.open("images/img$id.jpg")
        }catch(e: IOException){
            istr = assetManager.open("images/imgError.png")
        }
        return BitmapFactory.decodeStream(istr)
    }
}