package com.example.mvvm.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.data.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    // Define Live Data Mutable with Quote Model
    val quoteModel = MutableLiveData<QuoteModel>()

    // Assign the quote Model to Mutable Live Data and Get Single quote of provider
    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}