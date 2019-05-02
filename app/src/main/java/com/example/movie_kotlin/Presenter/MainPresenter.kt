package com.example.movie_kotlin.Presenter

import com.example.movie_kotlin.Base.BasePresenter
import com.example.movie_kotlin.Model.DummyData
import com.example.movie_kotlin.MvpView.ViewInterface

class MainPresenter: BasePresenter<ViewInterface>() {
    val movies= ArrayList<DummyData>()

    override fun attachView(viewInterface: ViewInterface) {
        super.attachView(viewInterface)
    }

     fun getMovie(){
        movies.add(DummyData("Avengers","Action","2019","A001","http://images.amazon.com/images/P/0596004478.01._PE30_PI_SCMZZZZZZZ_.jpg"))
        movies.add(DummyData("London in the City","Love Story","2019","A002","http://images.amazon.com/images/P/0596004613.01._PE30_PI_SCMZZZZZZZ_.jpg"))
        movies.add(DummyData("Spider Man","Action","2019","A003","http://images.amazon.com/images/P/0596004478.01._PE30_PI_SCMZZZZZZZ_.jpg"))
        movies.add(DummyData("BatMan","Action","2018","A004","https://homepages.cae.wisc.edu/~ece533/images/baboon.png"))
        movies.add(DummyData("X-men","Action","2017","A005","https://homepages.cae.wisc.edu/~ece533/images/boat.png"))
        getMvpView().displayMovie(movies)
    }
}