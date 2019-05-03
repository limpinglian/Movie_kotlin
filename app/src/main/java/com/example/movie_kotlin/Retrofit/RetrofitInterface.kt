package com.example.movie_kotlin.Retrofit

import com.example.movie_kotlin.Model.Movie
import com.example.movie_kotlin.Model.Search
import io.reactivex.Observable
import retrofit2.http.POST
import retrofit2.http.Query

interface RetrofitInterface {
    @POST("?apikey=e03c50d")
     fun getMovieResponse(@Query("s") title: String): Observable<Search>
}