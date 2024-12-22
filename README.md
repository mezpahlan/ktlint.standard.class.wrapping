# KtLint Standard Class Wrapping

Minimal reproduction to show highlight the issue raised in
this [Kotlin lang Slack thread](https://kotlinlang.slack.com/archives/CKS3XG0LS/p1734719695888749).

## Environment

* KtLint 1.5.0
* KtLint IDE Plugin 0.26.0-beta-1.2024-12-17_18-03-40 (so that we can use the latest KtLint version)

## Steps To Reproduce

1. Ensure you have the KtLint IDE plugin installed.
   * It should default to the latest version of KtLint but if not select 1.5.0.
2. Open the class `OkHttpClient`.
3. Format the file using the IDE autoformat shortcut of your choice.
   * The KtLint IDE plugin should attach itself to this shortcut and therefore invoke KtLint. 

## Expected Result

The class should be formatted like this (for the supplied `.editorconfig`).

```kotlin
internal open class OkHttpClientAdapter(
  private val url: String,
  private val httpClient: OkHttpClient = OkHttpClient()
) : HttpClientAdapter
```

## Actual Result

The class is formatted like this:

```kotlin
internal open class OkHttpClientAdapter(private val url: String, private val httpClient: OkHttpClient = OkHttpClient()) :
  HttpClientAdapter
```

Note the constructor parameters are all on a single line but the supertype has been moved to a 
separate line. This is what looks odd and unexpected.


