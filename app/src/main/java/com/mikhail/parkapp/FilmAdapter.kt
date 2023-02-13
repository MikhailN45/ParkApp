package com.mikhail.parkapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(private val filmList: List<Film>) :
    RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val id: TextView = itemView.findViewById(R.id.id_tv)
        val title: TextView = itemView.findViewById(R.id.title_tv)
        val poster: ImageView = itemView.findViewById(R.id.poster_iv)
        val release: TextView = itemView.findViewById(R.id.release_tv)
        val rating: TextView = itemView.findViewById(R.id.rating_tv)
        val description: TextView = itemView.findViewById(R.id.description_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.recycler_item,
            parent,
            false
        )
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = filmList[position]
        holder.id.setText(item.id)
        holder.title.setText(item.title)
        holder.poster.setImageResource(item.poster)
        holder.release.setText(item.releaseDate)
        holder.rating.setText(item.rating)
        holder.description.setText(item.description)
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

}