package com.example.testpaging3.viewmodel

import androidx.lifecycle.*
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.testpaging3.api.ApiService
import com.example.testpaging3.paging.RickyMortyPagingSource

class CharacterViewModel(
    private val apiService: ApiService
) : ViewModel() {

    val listData = Pager(PagingConfig(pageSize = 1)) {
        RickyMortyPagingSource(apiService)

    }.flow.cachedIn(viewModelScope)

}
























