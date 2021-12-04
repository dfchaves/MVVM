package com.example.mvvm.domain

import com.example.mvvm.data.QuoteRepository
import com.example.mvvm.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()
    // Create function operator suspended with call to repository and data layer
    suspend operator fun invoke(): List<QuoteModel> = repository.getAllQuotes()
}