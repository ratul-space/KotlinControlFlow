package com.example.kotlincontrolflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.String as String1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listener: View.OnClickListener = View.OnClickListener { view ->
            if (view.id == R.id.button1) {
                (findViewById(R.id.textView) as TextView).text =
                    "Try again , You clicked: " + (view as Button).text
            } else if (view.id == R.id.button2) {
                (findViewById(R.id.textView) as TextView).text = "You pressed the wrong button"
            } else if (view.id == R.id.button3) {
                (findViewById<TextView>(R.id.textView)).text = "Congratulations !!! You won the prize"
            } else {
                findViewById<TextView>(R.id.textView).text = "Sorry, you lost"

            }

        }
        var button1 = findViewById(R.id.button1) as Button
        var button2 = findViewById(R.id.button2) as Button
        var button3 = findViewById(R.id.button3) as Button
        var button4 = findViewById(R.id.button4) as Button

        button1.setOnClickListener(listener)
        button2.setOnClickListener(listener)
        button3.setOnClickListener(listener)
        button4.setOnClickListener(listener)

    }
}


