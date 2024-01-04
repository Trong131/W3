package com.example.myapplication.Tuan21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.R

class Tuan21MainActivity : AppCompatActivity() {
    var txt21: EditText? = null
    var txt22: EditText? = null
    var bt21: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan21_main)
        txt21 = findViewById(R.id.tuan21txt1)
        txt22 = findViewById(R.id.tuan21txt2)
        bt21 = findViewById(R.id.tuan211bt)
        bt21!!.setOnClickListener(View.OnClickListener {
            var i=Intent(this@Tuan21MainActivity, Tuan21SecondMainActivity::class.java)
            i.putExtra("so1", txt21!!.text.toString())
            i.putExtra("so2", txt22!!.text.toString())
            startActivity(i)
        })
    }
}