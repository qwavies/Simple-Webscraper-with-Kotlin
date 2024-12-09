import kotlin.text.Regex

class HTMLParser {
    companion object {
        // https://regex101.com/r/N9hj8H/1
        val A_TAG_PATTERN = Regex("<a(?:[^>]*)href=(['\\\"])(http.+?)\\1")
        const val URL_GROUP_INDEX = 2
    }
    
    public fun findUrls(html: String): Set<String> {
        return A_TAG_PATTERN.findAll(html)
        .mapNotNull { it.groups.get(URL_GROUP_INDEX)?.value }
        .toSet()
    }
}
