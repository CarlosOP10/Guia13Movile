package edu.bo.guia11_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class MainActivityGuia13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_guia13)
        session.user = "CALYR.SOFTWARE@GMAIL.COM"
    }

    fun openSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivityGuia13::class.java))
    }

}