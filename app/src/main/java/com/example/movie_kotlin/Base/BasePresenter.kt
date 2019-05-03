package com.example.movie_kotlin.Base

import com.example.movie_kotlin.MvpView.PresenterInterface
import com.example.movie_kotlin.MvpView.ViewInterface
import com.example.movie_kotlin.Retrofit.RetrofitInterface
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.icu.lang.UCharacter.GraphemeClusterBreak.T





open class BasePresenter<T:ViewInterface>:PresenterInterface<T> {
    private  var viewInterface :T?=null
    private var retrofit: Retrofit? = null
    private val BASE_URL = "http://www.omdbapi.com/"

    override fun attachView(viewInterface: T) {
        this.viewInterface = viewInterface
    }

    fun getMvpView(): T ?{
        return viewInterface
    }

    override fun detachView() {
        viewInterface=null
    }

    fun getRetrofitInstance(): RetrofitInterface {
        val client = OkHttpClient.Builder()
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        client.addInterceptor(loggingInterceptor)

        if (retrofit == null) {
            retrofit = retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client.build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
        }
        return retrofit!!.create(RetrofitInterface::class.java)
    }

}