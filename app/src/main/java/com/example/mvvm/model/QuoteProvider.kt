package com.example.mvvm.model

class QuoteProvider {
    companion object {

        fun random():QuoteModel{
            val position = (quote.indices).random()
            return quote[position]
        }
        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "It’s not a bug. It’s an undocumented feature!",
                author = "Juanes",
            ),
            QuoteModel(
                quote = "Software Developer” – An organism that turns caffeine into software",
                author = "Anonymous",
            ),
            QuoteModel(
                quote = "If debugging is the process of removing software bugs, then programming must be the process of putting them in",
                author = "Edsger Dijkstra",
            ),
            QuoteModel(
                quote = "A user interface is like a joke. If you have to explain it, it’s not that good.",
                author = "Edgar Alan Poe",
            ),
            QuoteModel(
                quote = "Things aren’t always #000000 and #FFFFFF",
                author = "Maria Melo",
            ),
            QuoteModel(
                quote = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
                author = "Juan Perez",
            ),
            QuoteModel(
                quote = "This is a another quote",
                author = "David Chaves",
            ),
        )
    }
}