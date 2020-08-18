package com.example.desafokotliniii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafokotliniii.model.Ciclovia
import com.example.desafokotliniii.model.SetupCiclovias

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cycloadapter: CycleAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filtrarCondes: Button = findViewById(R.id.lascondesboton)
        val nofiltrar : Button = findViewById(R.id.)

//        filtrarCondes.setOnClickListener()
        filtrarCondes.setOnClickListener(View.OnClickListener { view : View ->Unit})

        layoutManager = LinearLayoutManager(this)
        cycloadapter = CycleAdapter(
            SetupCiclovias().init() as MutableList<Ciclovia>)
        recyclerView = findViewById(R.id.recycler)
        recyclerView.adapter = cycloadapter
        recyclerView.layoutManager= layoutManager
        recyclerView.setHasFixedSize(true) //opcional


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