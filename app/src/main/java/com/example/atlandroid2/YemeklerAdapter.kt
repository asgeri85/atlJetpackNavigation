package com.example.atlandroid2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.atlandroid2.databinding.ItemFoodBinding
import com.example.atlandroid2.model.Yemek

class YemeklerAdapter : RecyclerView.Adapter<YemeklerAdapter.YemeklerViewHolder>() {

    private val yemekList = arrayListOf<Yemek>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): YemeklerViewHolder {
        val view = ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return YemeklerViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: YemeklerViewHolder,
        position: Int
    ) {

        val yemekItem = yemekList[position]

        holder.itemFoodBinding.yemek = yemekItem
        holder.itemFoodBinding.imageView.setImageResource(yemekItem.sekil)


    }

    override fun getItemCount(): Int {
        return yemekList.size
    }

    fun updateList(newList: ArrayList<Yemek>) {
        yemekList.clear()
        yemekList.addAll(newList)
        notifyDataSetChanged()
    }

    class YemeklerViewHolder(val itemFoodBinding: ItemFoodBinding) :
        RecyclerView.ViewHolder(itemFoodBinding.root)

}