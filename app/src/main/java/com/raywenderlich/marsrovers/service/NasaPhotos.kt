package com.raywenderlich.marsrovers.service

import com.raywenderlich.marsrovers.models.PhotoList
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object NasaPhotos {

    private val service : NasaAPI

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.nasa.gov/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
        service = retrofit.create(NasaAPI::class.java)
    }

    fun getPhotos(rover: String) : Call<PhotoList> = service.getPhotos(rover)


}