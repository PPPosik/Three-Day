package com.example.khj_pc.threeday.Service

import com.example.khj_pc.threeday.Data.Data
import com.example.khj_pc.threeday.Data.DataResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface DataService {
    @POST("/dev/data")
    fun sendWord(@Body data : Data) : Call<DataResponse>
}