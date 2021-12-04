package com.example.mvvm.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.data.model.QuoteProvider
import com.example.mvvm.domain.GetQuotesUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {

    // Define Live Data Mutable with Quote Model
    val quoteModel = MutableLiveData<QuoteModel>()
    // Define Live Data Mutable with Boolean for Progress Bar
    val isLoading = MutableLiveData<Boolean>()

    // Call use case defined in the domain layer
    var getQuoteUseCase = GetQuotesUseCase()

    // Create onCreate Function to call the use case and assign values to live data
    fun onCreate() {
        viewModelScope.launch {
            // Set on true progress bar process
            isLoading.postValue(true)
            val result = getQuoteUseCase()
            if (!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
                // Set on false progress bar after data loaded
                isLoading.postValue(false)
            }
        }
    }

    // Assign the quote Model to Mutable Live Data and Get Single quote of provider
    fun randomQuote() {
//        val currentQuote = QuoteProvider.random()
//        quoteModel.postValue(currentQuote)
    }


}