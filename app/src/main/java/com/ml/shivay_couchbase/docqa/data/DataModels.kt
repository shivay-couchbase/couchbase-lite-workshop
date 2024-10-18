package com.ml.couchbase.docqa.data

data class Chunk(
    var chunkId: Long = 0,
    var docId: String = 0.toString(),
    var docFileName: String = "",
    var chunkData: String = "",
    var chunkEmbedding: FloatArray = floatArrayOf()
)

data class Document(
    var docId: Long = 0,
    var docText: String = "",
    var docFileName: String = "",
    var docAddedTime: Long = 0,
)

data class RetrievedContext(val fileName: String, val context: String)

data class QueryResult(val response: String, val context: List<RetrievedContext>)

