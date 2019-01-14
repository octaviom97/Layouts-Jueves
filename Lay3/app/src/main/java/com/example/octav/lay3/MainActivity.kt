package com.example.octav.lay3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnLongClickListener{
            Toast.makeText(this@MainActivity,"Funcionó tu click",Toast.LENGTH_SHORT).show()
            true

        }
    }

    fun sumarContador(view:View){
        contador++
        mostrarResultado(view)
    }

    fun restarContador(view: View){
        contador--
        mostrarResultado(view)
    }

    fun mostrarResultado(view: View){
        var resultado = findViewById(R.id.textView) as TextView
        resultado.setText("Contador: $contador")


    }
}
