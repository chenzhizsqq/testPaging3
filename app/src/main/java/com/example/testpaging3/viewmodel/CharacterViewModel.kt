package com.example.testpaging3.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.testpaging3.api.ApiService
import com.example.testpaging3.paging.RickyMortyPagingSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel
@Inject
constructor(
    private val apiService: ApiService
) : ViewModel() {

    val listData = Pager(PagingConfig(pageSize = 1)) {
        RickyMortyPagingSource(apiService)

    }.flow.cachedIn(viewModelScope)

}
























