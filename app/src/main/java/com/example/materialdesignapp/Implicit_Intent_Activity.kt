package com.example.materialdesignapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ShareCompat

class Implicit_Intent_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)
    }

    fun openWebsite(view: View) {
        var ed1 = findViewById<EditText>(R.id.ed1)
        var uri = Uri.parse(ed1.text.toString())
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

    fun openDialPad(view: View) {
        var ed2 = findViewById<EditText>(R.id.ed2)
        var uri = Uri.parse("tel:"+ed2.text.toString())
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

    fun openMap(view: View) {
        var ed3 = findViewById<EditText>(R.id.ed3)
        var uri = Uri.parse("geo:0,0?q="+ed3.text.toString())
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

    fun shareText(view: View) {
        var ed4 = findViewById<EditText>(R.id.ed4)
        ShareCompat.IntentBuilder
            .from(this)
            .setText(ed4.text.toString())
            .setType("text/plain")
            .startChooser()
    }
}














