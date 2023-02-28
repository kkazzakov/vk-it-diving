package com.example.vk;

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

val Colors = listOf("#24ACFF", "#255C5B")
val Colors2 = listOf("#FF5722", "#673AB7")

class CustomRecyclerAdapter(private val names: kotlin.collections.List<String>): RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>()  {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val smallTextView: TextView = itemView.findViewById(R.id.textViewSmall)
        val photo: ImageView = itemView.findViewById(R.id.photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.member, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.smallTextView.text = names[position]
        holder.itemView.background.setTint(Color.parseColor(Colors[position % 2]))
        holder.photo.background.setTint(Color.parseColor(Colors2[position % 2]))
        if (position % 2 == 0){
            holder.photo.setImageResource(R.drawable.ic_launcher_man)
        }
        else {
            holder.photo.setImageResource(R.drawable.ic_launcher_man2)
        }

    }
    override fun getItemCount() = names.size

}