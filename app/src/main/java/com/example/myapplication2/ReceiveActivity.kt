package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_receive.*

class ReceiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive)


        val person = intent.getParcelableExtra<Person>("CUSTOM OBJ")

        val message = "${person?.name}  ${person?.college}"


        tvReceive.text = message




    }



}