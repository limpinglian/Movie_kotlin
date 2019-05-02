package com.example.movie_kotlin.Base

import com.example.movie_kotlin.MvpView.PresenterInterface
import com.example.movie_kotlin.MvpView.ViewInterface

open class BasePresenter<T:ViewInterface>:PresenterInterface<T> {
    private  lateinit var viewInterface :T

    override fun attachView(viewInterface: T) {
        this.viewInterface = viewInterface
    }

    fun getMvpView(): T {
        return viewInterface
    }

}