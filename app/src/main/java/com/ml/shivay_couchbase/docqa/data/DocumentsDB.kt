package com.ml.couchbase.docqa.data

//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.ExperimentalCoroutinesApi
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.flow
//import kotlinx.coroutines.flow.flowOn
//import com.couchbase.lite.Function
//import com.couchbase.lite.*

// class DocumentsDB {

//     private val database: Database = DatabaseManager.getDatabase()

//     fun addDocument(document: Document): String {
//         val mutableDoc = MutableDocument()
//         mutableDoc.setString("docFileName", document.docFileName)
//         mutableDoc.setString("docText", document.docText)
//         mutableDoc.setLong("docAddedTime", document.docAddedTime)
//         database.save(mutableDoc)
//         return mutableDoc.id
//     }

//     fun removeDocument(docId: String) {
//         database.getDocument(docId)?.let {
//             database.delete(it)
//         }
//     }

//     @OptIn(ExperimentalCoroutinesApi::class)
//     fun getAllDocuments(): Flow<List<Document>> = flow {
//         val query = QueryBuilder
//             .select(SelectResult.all())
//             .from(DataSource.database(database))

//         val result = query.execute()
//         val documents = result.map { row ->
//             val doc = row.getDictionary(database.name)
//             Document(
//                 docId = doc?.getString("id")?.toLong() ?: 0,
//                 docFileName = doc?.getString("docFileName") ?: "",
//                 docText = doc?.getString("docText") ?: "",
//                 docAddedTime = doc?.getLong("docAddedTime") ?: 0
//             )
//         }
//         emit(documents)
//     }.flowOn(Dispatchers.IO)

//     fun getDocsCount(): Long {
//         val query = QueryBuilder
//             .select(SelectResult.expression(Function.count(Expression.string("*"))))
//             .from(DataSource.database(database))

//         val result = query.execute().firstOrNull()?.getInt(0)
//         return result?.toLong() ?: 0L
//     }


// }



//package com.ml.couchbase.docqa.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import com.couchbase.lite.Function
import com.couchbase.lite.*

class DocumentsDB {
    private val database: Database = DatabaseManager.getDatabase()

    fun addDocument(document: Document): String {
        // Placeholder implementation
        return "mock_doc_id"
    }

    fun removeDocument(docId: String) {
        // Placeholder implementation
    }

    fun getAllDocuments(): Flow<List<Document>> = flow {
        // Placeholder implementation
        emit(List(5) { index -> Document(docId = index.toLong(), docFileName = "mock_doc_$index.pdf") })
    }

    fun getDocsCount(): Long = 5L
}