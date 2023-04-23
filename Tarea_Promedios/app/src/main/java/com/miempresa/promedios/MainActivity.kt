package com.miempresa.promedios

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun PromFin(num1:Double,num2:Double,num3:Double,num4:Double,num5: Double):Double{
        return (num1 * 0.7)+((num2+num3+num4+num5)*0.3)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtpromLab = findViewById<EditText>(R.id.txtpromLab)
        var txtpractica1 = findViewById<EditText>(R.id.txtpractica1)
        var txtpractica2 = findViewById<EditText>(R.id.txtpractica2)
        var txtpractica3 = findViewById<EditText>(R.id.txtpractica3)
        var txtpractica4 = findViewById<EditText>(R.id.txtpractica4)
        var txtResultado = findViewById<EditText>(R.id.txtResultado)
        var btnResultado = findViewById<Button>(R.id.btnResultado)
        var imgResultado = findViewById<ImageView>(R.id.imgResultado)

        btnResultado.setOnClickListener(){
            var numero1 = txtpromLab.text.toString().toDouble()
            var numero2 = txtpractica1.text.toString().toDouble()
            var numero3 = txtpractica2.text.toString().toDouble()
            var numero4 = txtpractica3.text.toString().toDouble()
            var numero5 = txtpractica4.text.toString().toDouble()
            var promedio = (PromFin(numero1,numero2,numero3,numero4,numero5))
            var respuesta = promedio.toString()
            txtResultado.setText(respuesta)

            if(promedio >= 10){
                imgResultado.setImageResource(R.drawable.caritafeliz)
            } else {
                imgResultado.setImageResource(R.drawable.caritatriste)
            }
        }
    }
}
