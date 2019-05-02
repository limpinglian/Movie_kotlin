package com.example.movie_kotlin.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import com.example.movie_kotlin.Model.Data
import com.example.movie_kotlin.Model.Movie
import com.example.movie_kotlin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item.view.*

 class RecyclerViewAdapter(val dataList:List<Data>, val context:Context): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): RecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.tvTitle.text=dataList[position].Title
        holder.tvType.text=dataList[position].Type
        holder.tvYear.text=dataList[position].Year
        holder.tvImbId.text=dataList[position].Imbid
        Picasso.get().load(dataList[position].Poster).into(holder.ivPoster)


    }

    override fun getItemCount(): Int {
        return dataList.size
    }
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Holds the TextView that will add each animal to
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val tvType = itemView.findViewById<TextView>(R.id.tvType)
        val tvYear = itemView.findViewById<TextView>(R.id.tvYear)
        val tvImbId = itemView.findViewById<TextView>(R.id.tvImdbId)
        val ivPoster=itemView.findViewById<ImageView>(R.id.ivPoster)


    }


}
