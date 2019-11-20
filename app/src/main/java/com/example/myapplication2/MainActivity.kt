package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.lifecycle.LifecycleObserver
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),LifecycleObserver {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var person = Person("Gaurav","UCER")

        val textMessage = "Hello , i am wrting you this "

        val sendIntent = Intent(this,ReceiveActivity::class.java).apply {


            putExtra("CUSTOM OBJ", person)

        }

        btSEND.setOnClickListener {
            startActivity(sendIntent)
        }


    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "On Start", LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "On Resume", LENGTH_SHORT).show()


    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "On Pause", LENGTH_SHORT).show()


    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "On Stop", LENGTH_SHORT).show()

    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this, "On Restart", LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "On Destroy", LENGTH_SHORT).show()


    }

    
}
