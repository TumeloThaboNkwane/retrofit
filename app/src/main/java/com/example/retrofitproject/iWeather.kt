package com.example.retrofitproject

import com.example.retrofitproject.models.Hour3Forcast
import com.example.retrofitproject.models.WeatherForcast
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface iWeather
{
    @GET("/data/2.5/forecast?")
    suspend fun getWeekData(@Query("lat") lat:String,@Query("lon") lon:String,@Query("appid") appid:String) : Response<WeatherForcast>
}