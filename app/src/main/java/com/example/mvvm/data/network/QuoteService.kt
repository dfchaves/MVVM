package com.example.mvvm.data.network

import com.example.mvvm.core.RetrofitHelper
import com.example.mvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit()
    // Call function to API Client and Define Corroutine
    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO){
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}