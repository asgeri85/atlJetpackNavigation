package com.example.atlandroid2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.atlandroid2.HomeFragmentDirections
import com.example.atlandroid2.databinding.ItemAnimalBinding
import com.example.atlandroid2.model.Animal

class AnimalAdapter : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    private val animalList = arrayListOf<Animal>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AnimalViewHolder {
        val view = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: AnimalViewHolder,
        position: Int
    ) {
        val animalItem = animalList[position]

        holder.itemAnimalBinding.animal = animalItem

        holder.itemAnimalBinding.cardAnimal.setOnClickListener {
            Navigation.findNavController(it).navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(animalItem))
        }
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    fun updateList(newList: ArrayList<Animal>){
        animalList.clear()
        animalList.addAll(newList)
        notifyDataSetChanged()
    }

    class AnimalViewHolder(val itemAnimalBinding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(itemAnimalBinding.root)

}