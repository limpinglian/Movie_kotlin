package com.example.movie_kotlin.Presenter

import android.util.Log
import com.example.movie_kotlin.Base.BasePresenter
import com.example.movie_kotlin.Model.Search
import com.example.movie_kotlin.MvpView.ViewInterface
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class MainPresenter: BasePresenter<ViewInterface>() {

    override fun attachView(viewInterface: ViewInterface) {
        super.attachView(viewInterface)
    }

     fun onDetachView() {
         super.detachView()
    }


    fun searchMovies(serachText: String) {
        val service = getRetrofitInstance()
        service.getMovieResponse(serachText)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(object : DisposableObserver<Search>() {
                override fun onNext(search: Search) {
                    if (search != null) {
                        getMvpView()!!.displayMovie(search)
                    } else {
                        Log.d("error", "is null")
                    }
                }

                override fun onError(t: Throwable) {

                }

                override fun onComplete() {

                }
            })
    }
}