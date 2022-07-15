package com.project.khoirudin.moviecatalogue

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.tv_item.view.*

class TvAdapter(
    private val tv : List<Tv>, val listener: OnAdapterListener
) : RecyclerView.Adapter<TvAdapter.TvViewHolder>(){

    class TvViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bindTv(tv : Tv){
            itemView.tv_name.text = tv.name
            itemView.tv_overview.text = tv.overview
            itemView.date.text = tv.date
            Glide.with(itemView).load(IMAGE_BASE + tv.poster).into(itemView.tv_poster)
            Log.e("TvAdapter","URL Image ==> $IMAGE_BASE${tv.poster}")
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvViewHolder {
        return TvViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.tv_item, parent, false))
    }

    override fun getItemCount(): Int = tv.size

    override fun onBindViewHolder(holder: TvViewHolder, position: Int) {
        holder.bindTv(tv[position])
        holder.itemView.setOnClickListener { listener.onClick(tv[position]) }
    }

    interface OnAdapterListener {
        fun onClick(result: Tv)
    }

}
