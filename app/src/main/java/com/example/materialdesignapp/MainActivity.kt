package com.example.materialdesignapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var atv = findViewById<AutoCompleteTextView>(R.id.atv)
        var city = arrayOf("Ahemdabad","Rajkot","Surat","Vadodara")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, city)
        atv.setAdapter(adapter)
    }

    fun moveToNext(view: View) {
        var i = Intent(this, Implicit_Intent_Activity::class.java)
        startActivity(i)

    }
}