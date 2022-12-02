package com.example.kotlin_odev4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var flag = true
        var b1 = findViewById<Button>(R.id.btn1)
        var b2 = findViewById<Button>(R.id.btn2)
        var b3 = findViewById<Button>(R.id.btn3)


        b1.setOnClickListener {
          if(flag){
             b1.backgroundTintList=getColorStateList(android.R.color.holo_green_dark)
                  Toast.makeText(this, "Seçiminiz Alınmıştır!", Toast.LENGTH_SHORT).show()
              flag = false
          }
          else{
              b1.backgroundTintList=getColorStateList(android.R.color.holo_orange_dark)
              Toast.makeText(this, "Seçiminiz Geri Alınmıştır! Tekrar Oylayınız...", Toast.LENGTH_LONG).show()
              flag = true
              }

          }

        b2.setOnClickListener {
            if(flag){
                b2.backgroundTintList=getColorStateList(android.R.color.holo_green_dark)
                Toast.makeText(this, "Seçiminiz Alınmıştır!", Toast.LENGTH_SHORT).show()
                flag = false
            }
            else{
                b2.backgroundTintList=getColorStateList(android.R.color.holo_orange_dark)
                Toast.makeText(this, "Seçiminiz Geri Alınmıştır! Tekrar Oylayınız...", Toast.LENGTH_LONG).show()
                flag= true
            }
        }
        b3.setOnClickListener {
            if(flag){
                b3.backgroundTintList=getColorStateList(android.R.color.holo_green_dark)
                Toast.makeText(this, "Seçiminiz Alınmıştır!", Toast.LENGTH_SHORT).show()
                flag = false
            }
            else{
                b3.backgroundTintList=getColorStateList(android.R.color.holo_orange_dark)
                Toast.makeText(this, "Seçiminiz Geri Alınmıştır! Tekrar Oylayınız...", Toast.LENGTH_LONG).show()
                flag= true
            }
        }



    }
}