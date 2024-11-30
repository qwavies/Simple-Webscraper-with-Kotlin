import java.net.URL

class Scraper(private val urlPath: String) {
    fun start() {
        println(getRawHTML(urlPath))
    }

    private fun getRawHTML(url: String): String {
        return URL(url).readText()
    }
}


fun main() {
    val scraper = Scraper("https://kotlinlang.org/")
    scraper.start()
}