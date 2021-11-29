package com.example.hiphopschool.presentation.home_screen

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.data.QuotesItem
import com.example.hiphopschool.presentation.home_screen.components.HSRowPairItem
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import org.json.JSONArray
import javax.inject.Inject

/**
 * viewModel for HomeScreen
 * */
@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    @ApplicationContext val context: Context
) : ViewModel() {
    private val _topicListState = mutableStateOf<List<HSRowPairItem>>(
        listOf(
            HSRowPairItem(
                textFirst = "History",
                textSecond = "Greatest of All Time"
            ),
            HSRowPairItem(
                textFirst = "Greatest Hits",
                textSecond = "Best Albums"
            ),
            HSRowPairItem(
                textFirst = "Beefs",
                textSecond = "Current Scenario"
            )
//            HSRowPairItem(
//                textFirst = "Best Albums",
//                textSecond = "Random Facts"
//            )
        )
    )
    val topicListState : State<List<HSRowPairItem>> = _topicListState

    private val _quotes = mutableStateOf<Array<QuotesItem>>(arrayOf(QuotesItem("", "")))
    val quotes : State<Array<QuotesItem>> = _quotes
    private val _quote = mutableStateOf<QuotesItem>(quotes.value.random())
    val quote : State<QuotesItem> = _quote
    init{
        _quotes.value = loadQuotesFromAssets()
        _quote.value = loadQuotesFromAssets().random()
    }

    private fun loadQuotesFromAssets(): Array<QuotesItem> {
        val inputStream = context.assets.open("QuoteList.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson();
        return gson.fromJson(json, Array<QuotesItem>::class.java)
    }

    fun getRandomQuote(){
        _quote.value = _quotes.value.random()
    }

}