package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    private lateinit var  photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Apple",R.drawable.apple))
        dataList.add(DataModel("Banana",R.drawable.banana))
        dataList.add(DataModel("Kiwi",R.drawable.kiwi))
        dataList.add(DataModel("Mango",R.drawable.mango))
        dataList.add(DataModel("Lemon",R.drawable.lemon))
        dataList.add(DataModel("Lychee",R.drawable.lychee))
        dataList.add(DataModel("Watermelon",R.drawable.watermelon))
        dataList.add(DataModel("Peach",R.drawable.peach))
        dataList.add(DataModel("Pears",R.drawable.pears))
        dataList.add(DataModel("Dragon fruit",R.drawable.dragon))

        photoAdapter.setDataList(dataList)
    }



    }


