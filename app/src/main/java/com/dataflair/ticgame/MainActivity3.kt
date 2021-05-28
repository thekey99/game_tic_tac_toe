package com.dataflair.ticgame

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    val button = findViewById<Button>(R.id.startGame)
                   val button2 = findViewById<Button>(R.id.quitGame)

                   button.setOnClickListener {
               val intent = Intent(this, MainActivity::class.java)
               startActivity(intent)

    }

     button2.setOnClickListener{
                 val quit : AlertDialog = AlertDialog.Builder(this).create()
                 quit.setTitle("Quit Game")
                 quit.setMessage("Are you sure you want to quit?")
                 quit.setButton(AlertDialog.BUTTON_POSITIVE,"Yes"){
                    dialog, which -> finish()
                    dialog.dismiss()
                 } //Quit Game Dialog

                 quit.setButton(AlertDialog.BUTTON_NEGATIVE,"No"){
                     dialog, which ->
                     dialog.dismiss()
                 } //Stay in Game
                 quit.show() //Show dialog
             }
        }
}