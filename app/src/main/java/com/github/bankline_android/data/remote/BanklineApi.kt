package com.github.bankline_android.data.remote

import com.github.bankline_android.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineApi {

    @GET("movimentacoes/{id}")
    suspend fun findBankStatement(@Path("id") accountHolderId: Int): List<Movimentacao>
}