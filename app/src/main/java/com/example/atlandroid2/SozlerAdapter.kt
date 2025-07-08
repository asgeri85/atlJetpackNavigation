package com.example.atlandroid2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.atlandroid2.databinding.ItemSozBinding

class SozlerAdapter() : RecyclerView.Adapter<SozlerAdapter.SozViewHolder>() {

    private val sozlerList = arrayListOf<String>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SozViewHolder {
        val view = ItemSozBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return SozViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: SozViewHolder,
        position: Int
    ) {
        val soz = sozlerList[position]

        holder.itemSozBinding.textView.text = soz
    }

    override fun getItemCount(): Int {
        return sozlerList.size
    }

    fun updateList(newList: ArrayList<String>){
        sozlerList.clear()
        sozlerList.addAll(newList)
        notifyDataSetChanged()
    }

    class SozViewHolder( val itemSozBinding: ItemSozBinding) :
        RecyclerView.ViewHolder(itemSozBinding.root)

}