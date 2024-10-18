// package com.ml.couchbase.docqa.domain

// import android.util.Log
// import com.ml.couchbase.docqa.data.QueryResult
// import com.ml.couchbase.docqa.data.RetrievedContext
// import com.ml.couchbase.docqa.domain.llm.GeminiRemoteAPI
// import javax.inject.Inject
// import javax.inject.Singleton
// import kotlinx.coroutines.CoroutineScope
// import kotlinx.coroutines.Dispatchers
// import kotlinx.coroutines.launch

// @Singleton
// class QAUseCase
// @Inject
// constructor(
//     private val documentsUseCase: DocumentsUseCase,
//     private val chunksUseCase: ChunksUseCase,
//     private val geminiRemoteAPI: GeminiRemoteAPI
// ) {

//     fun getAnswer(query: String, prompt: String, onResponse: ((QueryResult) -> Unit)) {
//         var jointContext = ""
//         val retrievedContextList = ArrayList<RetrievedContext>()
//         chunksUseCase.getSimilarChunks(query, n = 5).forEach {
//             jointContext += " " + it.second.chunkData
//             retrievedContextList.add(RetrievedContext(it.second.docFileName, it.second.chunkData))
//         }
//         Log.e("APP", "Context: $jointContext")
//         val inputPrompt = prompt.replace("\$CONTEXT", jointContext).replace("\$QUERY", query)
//         CoroutineScope(Dispatchers.IO).launch {
//             geminiRemoteAPI.getResponse(inputPrompt)?.let { llmResponse ->
//                 onResponse(QueryResult(llmResponse, retrievedContextList))
//             }
//         }
//     }

//     fun canGenerateAnswers(): Boolean {
//         return documentsUseCase.getDocsCount() > 0
//     }
// }


package com.ml.couchbase.docqa.domain

import com.ml.couchbase.docqa.data.QueryResult
import com.ml.couchbase.docqa.data.RetrievedContext
import com.ml.couchbase.docqa.domain.llm.GeminiRemoteAPI
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Singleton
class QAUseCase @Inject constructor(
    private val documentsUseCase: DocumentsUseCase,
    private val chunksUseCase: ChunksUseCase,
    private val geminiRemoteAPI: GeminiRemoteAPI
) {
    fun getAnswer(query: String, prompt: String, onResponse: ((QueryResult) -> Unit)) {
        // Placeholder implementation
        CoroutineScope(Dispatchers.IO).launch {
            val mockResponse = "This is a mock answer to the query: $query"
            val mockContext = List(2) { RetrievedContext("mock_doc.pdf", "Mock context") }
            onResponse(QueryResult(mockResponse, mockContext))
        }
    }

    fun canGenerateAnswers(): Boolean = true
}