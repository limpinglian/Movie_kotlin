package com.example.movie_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import com.example.movie_kotlin.Adapter.RecyclerViewAdapter
import com.example.movie_kotlin.Model.Data
import com.example.movie_kotlin.Model.Movie

class MainActivity : AppCompatActivity() {
    val movies= ArrayList<Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etSearch=findViewById<EditText>(R.id.etSearch)
        val btnSearch=findViewById<Button>(R.id.btnSearch)

            movies.add(Data("Avengers","Action","2019","A001","http://images.amazon.com/images/P/0596004478.01._PE30_PI_SCMZZZZZZZ_.jpg"))
            movies.add(Data("London in the City","Love Story","2019","A002","http://images.amazon.com/images/P/0596004613.01._PE30_PI_SCMZZZZZZZ_.jpg"))
            movies.add(Data("Spider Man","Action","2019","A003","http://images.amazon.com/images/P/0596004478.01._PE30_PI_SCMZZZZZZZ_.jpg"))
            movies.add(Data("BatMan","Action","2018","A004","https://homepages.cae.wisc.edu/~ece533/images/baboon.png"))
            movies.add(Data("X-men","Action","2017","A005","https://homepages.cae.wisc.edu/~ece533/images/boat.png"))

            val recyclerView=findViewById<RecyclerView>(R.id.recycler)
            val adapter = RecyclerViewAdapter(movies,this)
            recyclerView.setHasFixedSize(true)
            recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
            recyclerView.adapter = adapter



    }

}
