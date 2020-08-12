package com.example.desafokotliniii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.wtf("kk", SetupCiclovias().init().toString())



//        Log.wtf("kk", SetupCiclovias().init1().toString())
//        var numero:Int =0
//
//        when (numero){
//            0->Toast.makeText(this, "chupalito", Toast.LENGTH_LONG).show()
//            1,2->Toast.makeText(this, "chupalote", Toast.LENGTH_LONG).show()
//        }
    }
}