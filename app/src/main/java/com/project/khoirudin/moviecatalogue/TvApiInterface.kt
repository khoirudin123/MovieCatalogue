package com.project.khoirudin.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {

    @GET("/3/tv/popular?api_key=fc7818de99b96e98a041cc0cdeab421e")
    fun getTvList(): Call<TvResponse>
}
