/**
 * This class, when formatted by KtLint looks odd.
 */
internal open class OkHttpClientAdapter(private val url: String, private val httpClient: OkHttpClient = OkHttpClient()) : HttpClientAdapter {
  fun someFunction() = Unit
}
