package com.ml.couchbase.docqa

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import com.couchbase.lite.BasicAuthenticator
import com.couchbase.lite.Collection
import com.couchbase.lite.CouchbaseLite
import com.couchbase.lite.DataSource
import com.couchbase.lite.Database
import com.couchbase.lite.DocumentFlag
import com.couchbase.lite.ListenerToken
import com.couchbase.lite.LogDomain
import com.couchbase.lite.LogLevel
import com.couchbase.lite.MutableArray
import com.couchbase.lite.MutableDocument
import com.couchbase.lite.Parameters
import com.couchbase.lite.Query
import com.couchbase.lite.QueryBuilder
import com.couchbase.lite.Replicator
import com.couchbase.lite.ReplicatorConfiguration
import com.couchbase.lite.ReplicatorType
import com.couchbase.lite.ResultSet
import com.couchbase.lite.SelectResult
import com.couchbase.lite.URLEndpoint
import com.couchbase.lite.VectorEncoding
import com.couchbase.lite.VectorIndexConfiguration
import com.ml.couchbase.docqa.data.DatabaseManager


@HiltAndroidApp
class DocQAApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DatabaseManager.init(this)

    }
}
