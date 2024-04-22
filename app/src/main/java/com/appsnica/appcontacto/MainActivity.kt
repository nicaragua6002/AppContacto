package com.appsnica.appcontacto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.appsnica.appcontacto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //var listview: ListView = findViewById(R.id.listview1)
        binding.listview1.adapter = ContactoAdapter(this, Global.Contactos)

        binding.listview1.setOnItemClickListener{ parent, view, position, objects ->
            val i: Intent = Intent(this, Detalles::class.java)
            val contacto = Global.Contactos[position]
            i.putExtra("nombre", contacto.nombre)
            i.putExtra("numero", contacto.numero)

            startActivity(i)
        }
    }
}