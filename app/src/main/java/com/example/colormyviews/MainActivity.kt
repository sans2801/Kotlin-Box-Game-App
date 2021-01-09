package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var box1=findViewById<TextView>(R.id.box_1_text)
        var box2=findViewById<TextView>(R.id.box_2_text)
        var box3=findViewById<TextView>(R.id.box_3_text)
        var box4=findViewById<TextView>(R.id.box_4_text)
        var box5=findViewById<TextView>(R.id.box_5_text)

        box1.setOnClickListener {
            println("clicked")
            box1.alpha = when(box1.alpha)
            {
                0f->1f
                else->0f
            }
        }

        box2.setOnClickListener {
            println("clicked")
            box2.alpha = when(box2.alpha)
            {
                0f->1f
                else->0f
            }
        }

        box3.setOnClickListener {
            println("clicked")
            box3.alpha = when(box3.alpha)
            {
                0f->1f
                else->0f
            }
        }

        box4.setOnClickListener {
            println("clicked")
            box4.alpha = when(box4.alpha)
            {
                0f->1f
                else->0f
            }
        }

        box5.setOnClickListener {
            println("clicked")
            box5.alpha = when(box5.alpha)
            {
                0f->1f
                else->0f
            }
        }

        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b2)
        var b3 = findViewById<Button>(R.id.b3)
        var b4 = findViewById<Button>(R.id.b4)
        var b5 = findViewById<Button>(R.id.b5)
        var arr = arrayOf(0,0,0,0,0)
        b1.setOnClickListener {
            if(arr[0]==0) {box2.setBackgroundColor(Color.GREEN); arr[0]=1}
            else {box2.setBackgroundColor(Color.RED); arr[0]=0}
        }
    }
}