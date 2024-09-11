package com.zybooks.unit_converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CelciusToFahrenheit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celcius_to_fahrenheit)

        val celsiusNumber: EditText = findViewById(R.id.valueOfCelsius)
        val convertButton: Button = findViewById(R.id.celsiusToFahrenheitButton)
        val textResult: TextView = findViewById(R.id.textResult4)
        val homeButton: Button = findViewById(R.id.homeButton4)

        // Convert button
        convertButton.setOnClickListener {

            textResult.text = "Result: "+ (((celsiusNumber.text.toString().toInt() * 9F) / 5F) + 32F) + " Fahrenheit"
            Toast.makeText(this,"Result"+textResult.text, Toast.LENGTH_LONG).show()
        }

        // Go back home button
        homeButton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}