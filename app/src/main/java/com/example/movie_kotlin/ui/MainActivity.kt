package com.example.movie_kotlin.ui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import com.example.movie_kotlin.Adapter.RecyclerViewAdapter
import com.example.movie_kotlin.Base.BaseActivity
import com.example.movie_kotlin.Model.Data
import com.example.movie_kotlin.MvpView.ViewInterface
import com.example.movie_kotlin.Presenter.MainPresenter
import com.example.movie_kotlin.R

class MainActivity : BaseActivity() ,ViewInterface {

    val mainPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etSearch=findViewById<EditText>(R.id.etSearch)
        val btnSearch=findViewById<Button>(R.id.btnSearch)
        mainPresenter.attachView(this)
        mainPresenter.getMovie()

    }

    protected override fun setLayoutResourceId(): Int {
        return R.layout.activity_main
    }

    fun generateRecyclerView(dataList: List<Data>){
        val recyclerView=findViewById<RecyclerView>(R.id.recycler)
        val adapter = RecyclerViewAdapter(dataList,this)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.adapter = adapter
        Log.d("datalist", dataList.size.toString() + "")
    }

    override fun displayMovie(data:List<Data> ) {
        generateRecyclerView(data)

    }





}
