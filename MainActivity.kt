package com.zybooks.unit_converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Send to Kg to G screen
        val kgToG = findViewById<Button>(R.id.kg_to_g)
        kgToG.setOnClickListener{
            val Intent = Intent(this,KgToG::class.java)
            startActivity(Intent)
        }

        // Send to Kg to pound screen
        val poundToKg = findViewById<Button>(R.id.pound_to_kg)
        poundToKg.setOnClickListener{
            val Intent = Intent(this,PoundToKg::class.java)
            startActivity(Intent)
        }

        // Send to meters to yards screen
        val yardsToMeters = findViewById<Button>(R.id.yards_to_meters)
        yardsToMeters.setOnClickListener {
            val Intent = Intent(this,YardsToMeters::class.java)
            startActivity(Intent)
        }

        // Send to celcius to Fahrenheit screen
        val celciusToFahrenheit = findViewById<Button>(R.id.celcius_to_fahrenheit)
        celciusToFahrenheit.setOnClickListener {
            val Intent = Intent(this,CelciusToFahrenheit::class.java)
            startActivity(Intent)
        }

    }
}