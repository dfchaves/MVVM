package com.example.mvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
// Import for ActivityMainBinding
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.ui.viewModel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Call on create viewModel function to call first screen
        quoteViewModel.onCreate()

        // Create observer for Quote Models
        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            binding.tvQuote.text = currentQuote.quote
            binding.tvAutor.text = currentQuote.author
        })

        // Create observer for Progress Bar
        quoteViewModel.isLoading.observe(this, Observer { currentFocus ->
            binding.progressCircular.isVisible = currentFocus
        })

        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }
    }

}


