package com.example.riansyahsetiawan.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Book Catalog Riansyah Setiawan"
    }
    private val _textVersion = MutableLiveData<String>().apply {
        value = "1.0.0"
    }
    private val _textDeveloper = MutableLiveData<String>().apply {
        value = "Develop by Riansyah Setiawan"
    }
    val text: LiveData<String> = _text
    val textVersion: LiveData<String> = _textVersion
    val textDeveloper: LiveData<String> = _textDeveloper

}