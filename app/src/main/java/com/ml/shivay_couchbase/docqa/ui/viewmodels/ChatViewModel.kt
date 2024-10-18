package com.ml.couchbase.docqa.ui.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ml.couchbase.docqa.data.RetrievedContext
import com.ml.couchbase.docqa.domain.QAUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(val qaUseCase: QAUseCase) : ViewModel() {

    val questionState = mutableStateOf("")
    val responseState = mutableStateOf("")
    val isGeneratingResponseState = mutableStateOf(false)
    val retrievedContextListState = mutableStateOf(emptyList<RetrievedContext>())
}
