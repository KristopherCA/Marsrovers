package com.raywenderlich.marsrovers.service

import com.raywenderlich.marsrovers.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NasaAPI {
    @GET("mars-photos/api/v1/rovers/{rover}/photos?sol=1000&api_key=YghJinQb5cl9ve5qXgN1FJEHsMMPODi1q330V88c")
    fun getPhotos(@Path("rover") rover: String) : Call<PhotoList>
}