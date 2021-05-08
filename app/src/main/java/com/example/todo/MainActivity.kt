package com.example.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.adapter.TodoAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var mRecyclerView: RecyclerView
    lateinit var lAdapter : TodoAdapter
    lateinit var mAddTodo : FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = findViewById(R.id.recyclerView)
        mAddTodo = findViewById(R.id.floatingActionButton)

        val lAdapter = TodoAdapter()
        mRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = lAdapter
        }


        mAddTodo.setOnClickListener {
            val intent = Intent(this@MainActivity, AddNewTodoActivity :: class.java)
            startActivity(intent)
        }
    }
}