
package com.peculiaruc.moviedb.api

import com.peculiaruc.moviedb.model.response.MovieResponse
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query


private val BASE_URL = "https://developers.themoviedb.org/3"

interface RetrofitService {

    @GET("vie/popular")
    suspend fun getallMovie(@Query("api_key") api_key: String,
                            @Query("language") language: String = "en-US",
                            @Query("page") page: Int): MovieResponse


//add retrofit library
//       val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
//
//    val retrofit = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi))
//      .baseUrl(BASE_URL).build()

//create a signton for easly accessing the api service
//object Api{
//    val retrofitService:RetrofitService by lazy {
    //      retrofit.create(RetrofitService::class.java)
    //  }
//}
}

