package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var adapter: MyAdapter
    val items: ArrayList<MyData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        items.add(MyData(MyData.TYPE_A))
        items.add(MyData(MyData.TYPE_B))
        items.add(MyData(MyData.TYPE_C))
        items.add(MyData(MyData.TYPE_A))
        items.add(MyData(MyData.TYPE_B))
        items.add(MyData(MyData.TYPE_C))
        items.add(MyData(MyData.TYPE_A))
        items.add(MyData(MyData.TYPE_B))
        items.add(MyData(MyData.TYPE_C))
        items.add(MyData(MyData.TYPE_A))
        items.add(MyData(MyData.TYPE_B))
        items.add(MyData(MyData.TYPE_C))
        items.add(MyData(MyData.TYPE_A))
        items.add(MyData(MyData.TYPE_B))
        items.add(MyData(MyData.TYPE_C))
        items.add(MyData(MyData.TYPE_A))
        items.add(MyData(MyData.TYPE_B))
        items.add(MyData(MyData.TYPE_C))

        adapter = MyAdapter(items)

        binding.apply {
            recyclerView.layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            recyclerView.adapter = adapter
        }
    }

}
