// package com.ml.couchbase.docqa

// import android.os.Bundle
// import androidx.activity.ComponentActivity
// import androidx.activity.compose.setContent
// import androidx.activity.enableEdgeToEdge
// import androidx.compose.animation.fadeIn
// import androidx.compose.animation.fadeOut
// import androidx.navigation.compose.NavHost
// import androidx.navigation.compose.composable
// import androidx.navigation.compose.rememberNavController
// import com.ml.couchbase.docqa.ui.screens.ChatScreen
// import com.ml.couchbase.docqa.ui.screens.DocsScreen
// import dagger.hilt.android.AndroidEntryPoint

// @AndroidEntryPoint
// class MainActivity : ComponentActivity() {

//     override fun onCreate(savedInstanceState: Bundle?) {
//         super.onCreate(savedInstanceState)
//         enableEdgeToEdge()
//         setContent {
//             val navHostController = rememberNavController()
//             NavHost(
//                 navController = navHostController,
//                 startDestination = "chat",
//                 enterTransition = { fadeIn() },
//                 exitTransition = { fadeOut() }
//             ) {
//                 composable("docs") { DocsScreen(onBackClick = { navHostController.navigateUp() }) }
//                 composable("chat") {
//                     ChatScreen(onOpenDocsClick = { navHostController.navigate("docs") })
//                 }
//             }
//         }
//     }
// }


package com.ml.couchbase.docqa

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ml.couchbase.docqa.data.DatabaseManager
import com.ml.couchbase.docqa.domain.llm.GeminiRemoteAPI
import com.ml.couchbase.docqa.ui.screens.ChatScreen
import com.ml.couchbase.docqa.ui.screens.DocsScreen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        DatabaseManager.init(applicationContext)
        testGeminiAPI()
        setContent {
            val navHostController = rememberNavController()
            NavHost(
                navController = navHostController,
                startDestination = "chat",
                enterTransition = { fadeIn() },
                exitTransition = { fadeOut() }
            ) {
                composable("docs") { DocsScreen(onBackClick = { navHostController.navigateUp() }) }
                composable("chat") {
                    ChatScreen(onOpenDocsClick = { navHostController.navigate("docs") })
                }
            }
        }
    }

    private fun testGeminiAPI() {
        val geminiAPI = GeminiRemoteAPI()
        lifecycleScope.launch {
            val response = geminiAPI.getResponse("What is the capital of France?")
            Log.d("GeminiTest", "Response: $response")
        }
    }
}