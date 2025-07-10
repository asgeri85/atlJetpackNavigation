package com.example.atlandroid2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.atlandroid2.R
import com.example.atlandroid2.databinding.ItemTodoBinding
import com.example.atlandroid2.model.Oncelik
import com.example.atlandroid2.model.TodoModel

class TodoAdapter : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    private val todoList = arrayListOf<TodoModel>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TodoViewHolder {
        val view = ItemTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: TodoViewHolder,
        position: Int
    ) {
        val item = todoList[position]

        holder.binding.todo = item

        val image = when(item.oncelik){
            Oncelik.HIGH -> R.drawable.ayi
            Oncelik.MEDIUM -> R.drawable.qoyun
            Oncelik.LOW -> R.drawable.jaguar
        }

        holder.binding.imageView3.setImageResource(image)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    fun updateList(newList: ArrayList<TodoModel>){
        todoList.clear()
        todoList.addAll(newList)
        notifyDataSetChanged()
    }

    class TodoViewHolder(val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root)

}