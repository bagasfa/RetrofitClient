package com.example.retrofitclient.Custom

import retrofit2.Call
import com.example.retrofitclient.Model.MyModel
import retrofit2.http.GET

interface MyServices{
    @GET("posts")
    fun getPosts(): Call<List<MyModel>>
}