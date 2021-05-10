package com.example.viewpagerexample

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpagerexample.databinding.PageLayoutBinding

//same as the implementation of a recyclerview adapter
class PhotoAdapter(val photoList: List<Photos>): RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: PageLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = PageLayoutBinding.inflate(layoutInflater, parent, false)
        val viewHolder = ViewHolder(binding)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return photoList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val photo = photoList[position]
        holder.binding.photo = photo
        holder.binding.executePendingBindings()
    }
}