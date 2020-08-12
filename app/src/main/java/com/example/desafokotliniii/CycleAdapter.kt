package com.example.desafokotliniii

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CycleAdapter (private val listadoCiclos: MutableList<Ciclovia>):
                    RecyclerView.Adapter<CycleAdapter.CycleViewHolder>(){



    class CycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var cycloTV: TextView = itemView.findViewById(R.id.cycleView)
        var comunaTv: TextView = itemView.findViewById(R.id.comuna_tv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cyclo_item_list, parent, false)

        return CycleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listadoCiclos.size
    }

    override fun onBindViewHolder(holder: CycleViewHolder, position: Int) { //holder recipiente posición
        holder.comunaTv.text= listadoCiclos[position].comuna
        holder.cycloTV.text= listadoCiclos[position].nombre
    }
}