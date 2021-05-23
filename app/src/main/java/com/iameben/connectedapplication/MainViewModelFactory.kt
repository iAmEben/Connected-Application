package com.iameben.connectedapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(private val repository: Repository):ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(p0: Class<T>): T {
        return MainViewModel(repository) as T
    }
}