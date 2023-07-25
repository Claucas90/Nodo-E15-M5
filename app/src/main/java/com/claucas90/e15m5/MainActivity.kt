package com.claucas90.e15m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val listaDatos: MutableList<TuModeloDeDatos> = mutableListOf()

    val elementos = listOf(
        TuModeloDeDatos("Item1"),
        TuModeloDeDatos("Item2"),
        TuModeloDeDatos("Item3"),
        TuModeloDeDatos("Item4"),
        TuModeloDeDatos("Item5"),
        TuModeloDeDatos("Item6"),
        TuModeloDeDatos("Item7"),
        TuModeloDeDatos("Item8"),
        TuModeloDeDatos("Item9"),
        TuModeloDeDatos("Item10"),
        TuModeloDeDatos("Item11")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listaDatos.addAll(elementos)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = AdapterRecyclerView(listaDatos)
        recyclerView.adapter = adapter
    }
}
