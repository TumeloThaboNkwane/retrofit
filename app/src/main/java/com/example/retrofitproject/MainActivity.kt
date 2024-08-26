package com.example.retrofitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

val appid = "afbbc2428ca8b6fb2938d64fbcbe1f4e"
val lat = -25.7566
val lon = 28.1914

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {

            val response = api.retrofit.getWeekData(lat.toString(), lon.toString(), appid)

            if (response.isSuccessful){

                launch(Dispatchers.Main){

                    findViewById<TextView>(R.id.text).setText(response.body().toString())
                }
            }
            else{
                Log.v("openapi",response.message())
            }
        }


    }
}