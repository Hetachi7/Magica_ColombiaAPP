package com.example.trabajo1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Sing_in : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_in)
        val Singintbtn2: Button = findViewById(R.id.sing_in2)

        Singintbtn2.setOnClickListener(viewListener)

        val Cuentabtn:Button=findViewById(R.id.cuenta1)
        Cuentabtn.setOnClickListener(viewListener)
       }

      fun enviarhome(){
        val intent: Intent = Intent ( this,Home::class.java)
        startActivity(intent)
      }
  fun enviarLogin(){
      val intent:Intent=Intent(this,Login::class.java)
      startActivity(intent)
  }
      private val viewListener = View.OnClickListener {
        when(it.id){
            R.id.sing_in2->enviarhome()
            R.id.cuenta1->enviarLogin()
        }
      }
    }
