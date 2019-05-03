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
import com.example.movie_kotlin.Model.Movie
import com.example.movie_kotlin.Model.Search
import com.example.movie_kotlin.MvpView.ViewInterface
import com.example.movie_kotlin.Presenter.MainPresenter
import com.example.movie_kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() ,ViewInterface {

    val mainPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter.attachView(this)

        btnSearch.setOnClickListener {
            mainPresenter.searchMovies(etSearch.text.toString())
        }
    }


    protected override fun setLayoutResourceId(): Int {
        return R.layout.activity_main
    }

    fun generateRecyclerView(dataList: List<Movie>){
        val recyclerView=findViewById<RecyclerView>(R.id.recycler)
        val adapter = RecyclerViewAdapter(dataList,this)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.adapter = adapter
        Log.d("datalist", dataList.size.toString() + "")
    }

    override fun displayMovie(search: Search ) {
        generateRecyclerView(search.search)

    }

     override fun onDetachView() {
        super.onDestroy()
        mainPresenter.onDetachView()
    }





}
