## Setup

1. Clone the `main` branch, 

```bash
git clone https://github.com/shivay-couchbase/couchbase-lite-workshop.git
```

2. If `local.properties` doesn't exist, the build will use a default empty API key. To use the Gemini API, make sure to add your actual API key to `local.properties`.

If you don't have a `local.properties` file, create one in the root directory of the project and add your Gemini API key:
```
geminiKey="YOUR_ACTUAL_API_KEY_HERE"
```


3. Perform a Gradle sync, and run the application. 