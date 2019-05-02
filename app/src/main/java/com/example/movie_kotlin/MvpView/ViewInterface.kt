package com.example.movie_kotlin.MvpView

import com.example.movie_kotlin.Model.DummyData

interface ViewInterface {
    fun displayMovie(data:List<DummyData> )
}