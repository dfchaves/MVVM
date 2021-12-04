package com.example.mvvm.data

import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.data.model.QuoteProvider
import com.example.mvvm.data.network.QuoteService

class QuoteRepository {
    // Call to Quote Service
    private val api = QuoteService()
    // Define function to Get All Quotes with api call and assign to Provider
    suspend fun getAllQuotes(): List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}