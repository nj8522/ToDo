package com.example.todo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R

class TodoAdapter : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
       val lLayoutInflater = LayoutInflater.from(parent.context)
       val lTodoView = lLayoutInflater.inflate(
           R.layout.todo_card_layout,
           parent,
           false
       )
        return TodoViewHolder(lTodoView)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {}

    override fun getItemCount(): Int = 100

    inner class TodoViewHolder(pView : View) : RecyclerView.ViewHolder(pView){

    }
}