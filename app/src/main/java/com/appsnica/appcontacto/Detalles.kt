package com.appsnica.appcontacto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appsnica.appcontacto.databinding.ActivityDetallesBinding

class Detalles : AppCompatActivity() {
    private lateinit var binding: ActivityDetallesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetallesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fullname.setText(intent.getStringExtra("nombre"))
        binding.button.setText(intent.getStringExtra("numero"))

        binding.button.setOnClickListener {
            val i:Intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:"+binding.button.text))
            //i.putExtra("")
            startActivity(i)
        }




    }
}