package com.zybooks.unit_converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class PoundToKg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pound_to_kg)

        val kgNumber: EditText = findViewById(R.id.valueOfKg2)
        val convertButton: Button = findViewById(R.id.kgToIbButton)
        val textResult: TextView = findViewById(R.id.textResult2)
        val homeButton: Button = findViewById(R.id.homeButton2)

        // Convert button
        convertButton.setOnClickListener {

            textResult.text = "Result: "+ kgNumber.text.toString().toInt() * 2.20462+ "Ib"
            Toast.makeText(this,"Result"+textResult.text, Toast.LENGTH_LONG).show()
        }

        // Go back home button
        homeButton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}