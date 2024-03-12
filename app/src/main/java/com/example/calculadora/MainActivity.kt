package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val resultado: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOne = findViewById<Button>(R.id.btnOne)
        val btnTwo = findViewById<Button>(R.id.btnTwo)
        val btnThree = findViewById<Button>(R.id.btnThree)
        val btnFour = findViewById<Button>(R.id.btnFour)
        val btnFive = findViewById<Button>(R.id.btnFive)
        val btnSix = findViewById<Button>(R.id.btnSix)
        val btnSeven = findViewById<Button>(R.id.btnSeven)
        val btnEight = findViewById<Button>(R.id.btnEight)
        val btnNine = findViewById<Button>(R.id.btnNine)
        val btnDivisao = findViewById<Button>(R.id.btnDivisao)
        val btnSubtracao = findViewById<Button>(R.id.btnSubtracao)
        val btnMultiplicacao = findViewById<Button>(R.id.btnMultiplicacao)
        val btnSoma = findViewById<Button>(R.id.btnSoma)
        val btnResultado = findViewById<Button>(R.id.btnResultado)
        val btnApagar = findViewById<Button>(R.id.btnApagar)

        btnOne.setOnClickListener {

        }
    }
}