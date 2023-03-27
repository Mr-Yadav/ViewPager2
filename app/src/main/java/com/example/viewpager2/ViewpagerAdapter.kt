package com.example.viewpager2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewpagerAdapter(private val pic : List<item> ) : RecyclerView.Adapter<ViewpagerAdapter.ViewHolder>() {
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val img : ImageView = itemView.findViewById(R.id.img_viewpager)
        val text : TextView = itemView.findViewById(R.id.textView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

         val view = LayoutInflater.from(parent.context).inflate(R.layout.item_viewpager,parent,false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val curr = pic[position]

        holder.img.setImageResource(curr.pic)
        holder.text.text = curr.name
    }

    override fun getItemCount(): Int {

        return pic.size

    }

}
