package com.example.movie_kotlin.MvpView

import com.example.movie_kotlin.Model.Data

interface ViewInterface {
    fun displayMovie(data:List<Data> )
}