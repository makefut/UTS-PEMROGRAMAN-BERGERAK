package com.example.utspraktikum

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class AdapterData (private val Datadata: ArrayList<dataclass>, private val context: Context): RecyclerView.Adapter<AdapterData.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterData.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_data,
            parent, false
        )
        return CourseViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: AdapterData.CourseViewHolder, position: Int) {
        holder.nama.text = Datadata.get(position).Nama
        holder.nim.text = Datadata.get(position).Nim
        holder.umur.text = Datadata.get(position).umur
        holder.foto.setImageResource(Datadata.get(position).foto)
    }
    override fun getItemCount(): Int {
        return Datadata.size
    }
    class CourseViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById(R.id.idfoto)
        val nama: TextView = itemView.findViewById(R.id.idnama)
        val nim: TextView = itemView.findViewById(R.id.idnim)
        val umur: TextView = itemView.findViewById(R.id.idumur)

    }
}

