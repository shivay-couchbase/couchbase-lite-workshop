## Instructions to follow the Workshop

Instructions: https://docs.google.com/document/d/1QJS9MUaofSC1RfGFxzJVprY25D2S4c3a631HJRSiKEY/edit?usp=sharing

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
