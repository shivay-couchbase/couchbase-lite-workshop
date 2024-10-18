pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        maven {
            url = uri("https://mobile.maven.couchbase.com/maven2/dev/")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven{ url = uri("https://jitpack.io") }
        maven {
            url = uri("https://mobile.maven.couchbase.com/maven2/dev/")
        }
    }
}

rootProject.name = "CBLite-Doc"
include(":app")
