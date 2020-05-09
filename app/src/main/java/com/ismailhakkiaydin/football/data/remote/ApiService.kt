package com.ismailhakkiaydin.football.data.remote

import com.ismailhakkiaydin.football.model.country.CountryResponse
import com.ismailhakkiaydin.football.util.Constant
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {

    @Headers(Constant.API_KEY)
    @GET(Constant.GET_ALL_COUNTRIES)
    fun getAllCountries(): Single<CountryResponse>

}