// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        // ... other repositories ...
        maven(url = "https://mobile.maven.couchbase.com/maven2/dev/")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false
    id("com.google.dagger.hilt.android") version "2.50" apply false
}