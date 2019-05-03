package com.example.movie_kotlin.MvpView

import android.view.View

interface PresenterInterface<V:ViewInterface>{
    fun attachView(viewInterface:V)
    fun detachView()
}