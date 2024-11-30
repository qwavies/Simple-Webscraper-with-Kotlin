import java.net.URL

class Scraper(private val urlPath: String) {
    private val htmlParser = HTMLParser()

    fun start() {
        val rawHTML: String = getRawHTML(urlPath)
        val urls: Set<String> = htmlParser.findUrls(rawHTML)


    }

    private fun getRawHTML(url: String): String {
        return URL(url).readText()
    }
}


fun main() {
    println("Initializing...\n\n")


    val scraper = Scraper("https://kotlinlang.org/")
    scraper.start()

    println("\n\nExiting...")
}