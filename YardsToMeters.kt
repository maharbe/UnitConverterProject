package com.zybooks.unit_converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class YardsToMeters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yards_to_meters)

        val meterNumber: EditText = findViewById(R.id.valueOfMeter)
        val convertButton: Button = findViewById(R.id.meterToYardButton)
        val textResult: TextView = findViewById(R.id.textResult3)
        val homeButton: Button = findViewById(R.id.homeButton3)

        // Convert button
        convertButton.setOnClickListener {

            textResult.text = "Result: "+ meterNumber.text.toString().toInt() * 1.09361+ " yards"
            Toast.makeText(this,"Result"+textResult.text, Toast.LENGTH_LONG).show()
        }

        // Go back home button
        homeButton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}