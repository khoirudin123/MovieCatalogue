package com.project.khoirudin.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=fc7818de99b96e98a041cc0cdeab421e")
    fun getMovieList(): Call<MovieResponse>
}
