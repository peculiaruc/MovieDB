package com.peculiaruc.moviedb.model.response

import retrofit2.http.GET
import retrofit2.http.Query

interface MovieResponse {
    @GET("/3/movie/popular")
    fun  getMovies(@Query("api_key") key: String)
}




