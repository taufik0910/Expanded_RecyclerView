package com.example.expandedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expandedrecyclerview.R
import com.example.expandedrecyclerview.databinding.ParentItemListBinding
import com.example.expandedrecyclerview.model.MainModel

class MainAdapter(private val collections: List<MainModel>): RecyclerView.Adapter<MainAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item_list,parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collections[position]
            tvTitle.text = collection.title
            val subItemAdapter = SubItemAdapter(collection.subItemModels)
            rvSubItem.adapter= subItemAdapter
            tvTitle.setOnClickListener {
                rvSubItem.visibility = if (rvSubItem.isShown) View.GONE else View.VISIBLE
            }

        }
    }

    override fun getItemCount() = collections.size

    inner class MyViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        val binding = ParentItemListBinding.bind(itemView)

    }
}