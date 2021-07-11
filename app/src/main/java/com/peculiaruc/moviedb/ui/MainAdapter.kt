package com.peculiaruc.moviedb.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.moviedb.databinding.ListItemRecyclerviewBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.CockTailViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CockTailViewHolder {
        return CockTailViewHolder(
                ListItemRecyclerviewBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent, false))
    }

    override fun getItemCount(): Int {
      return  0
    }

    override fun onBindViewHolder(holder: CockTailViewHolder, position: Int) {

    }

    inner class CockTailViewHolder(private val binding: ListItemRecyclerviewBinding): RecyclerView.ViewHolder (binding.root){

        fun bindItem() {

        }
    }
}