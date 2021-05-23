package com.iameben.connectedapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iameben.connectedapplication.Constants.Companion.BASE_URL
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retro = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory()
    }

}