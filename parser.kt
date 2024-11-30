import kotlin.text.Regex

class HTMLParser {
    companion object {
        val A_TAG_PATTERN = Regex("<a(?:[^>]*)href=(['\\\"])(http.+?)\\1")
    }
    
    fun findUrls(html: String): Set<String> {
        println(A_TAG_PATTERN.findAll(html).first().groups.get(2)!!.value)
        return setOf()
    }
}