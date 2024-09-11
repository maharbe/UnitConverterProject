package com.zybooks.unit_converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class KgToG : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kg_to_g)

        val kgNumber: EditText = findViewById(R.id.valueOfKg)
        val convertButton: Button = findViewById(R.id.kgToGButton)
        val textResult: TextView = findViewById(R.id.textResult)
        val homeButton: Button = findViewById(R.id.homeButton)

        // Convert button
        convertButton.setOnClickListener {

            textResult.text = "Result: "+ kgNumber.text.toString().toInt() * 1000+ "g"
            Toast.makeText(this,"Result"+textResult.text, Toast.LENGTH_LONG).show()
        }

        // Go back home button
        homeButton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}
