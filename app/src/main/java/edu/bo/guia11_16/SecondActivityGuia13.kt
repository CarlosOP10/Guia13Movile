package edu.bo.guia11_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second_guia13.*

class SecondActivityGuia13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_guia13)
        Toast.makeText(this, session.user, Toast.LENGTH_SHORT).show()
        txtUserSession.text = session.user
    }
}