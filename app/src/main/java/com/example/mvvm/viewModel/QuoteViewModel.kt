package com.example.mvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.model.QuoteModel
import com.example.mvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    // Define Live Data Mutable with Quote Model
    val quoteModel = MutableLiveData<QuoteModel>()

    // Assign the quote Model to Mutable Live Data and Get Single quote of provider
    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}