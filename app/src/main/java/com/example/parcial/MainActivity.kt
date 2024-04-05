package com.example.parcial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var caja1: EditText
    lateinit var btnEnvio: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        caja1 = findViewById(R.id.caja1)
        btnEnvio =findViewById(R.id.btnEnvio)
        var intent = Intent(this@MainActivity, MainActivity2::class.java)

    }

}
