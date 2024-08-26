package com.example.retrofitproject.models

data class WeatherForcast(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<Hour3Forcast>,
    val message: Int
)