package com.example.expandedrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expandedrecyclerview.R
import com.example.expandedrecyclerview.databinding.SubListItemBinding
import com.example.expandedrecyclerview.model.SubItemModel

class SubItemAdapter(private val subItemModels: List<SubItemModel>) :
    RecyclerView.Adapter<SubItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.sub_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            tvSubItem.text= subItemModels[position].subItemTitle
        }
    }

    override fun getItemCount()= subItemModels.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = SubListItemBinding.bind(itemView)
    }
}