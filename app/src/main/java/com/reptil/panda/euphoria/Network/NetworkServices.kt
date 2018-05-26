package com.reptil.panda.euphoria.Network

import io.reactivex.Flowable
import retrofit2.http.GET
import com.reptil.panda.euphoria.Model.CurrencyModel

interface NetworkServices {

    @GET("v1/ticker/?convert=IDR&limit=15")
    fun getAllCurrency(): Flowable<List<CurrencyModel>>
}