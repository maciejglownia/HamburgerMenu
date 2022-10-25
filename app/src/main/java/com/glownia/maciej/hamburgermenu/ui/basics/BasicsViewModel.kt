package com.glownia.maciej.hamburgermenu.ui.basics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BasicsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Basics Fragment"
    }
    val text: LiveData<String> = _text
}