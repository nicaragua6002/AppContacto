package com.appsnica.appcontacto

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ContactoAdapter(context: Context, val lista: List<Contacto>)
    :ArrayAdapter<Contacto>(context,0,lista){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       // return super.getView(position, convertView, parent)
        var viewItem = convertView
        if (viewItem == null)
            viewItem = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_2, parent, false)
        var contacto = lista[position]

        viewItem!!.findViewById<TextView>(android.R.id.text1)?.setText(contacto.nombre)
        viewItem!!.findViewById<TextView>(android.R.id.text2)?.setText(contacto.numero)

        return viewItem!!


    }


}

