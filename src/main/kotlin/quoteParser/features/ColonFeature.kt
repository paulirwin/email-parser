package quoteParser.features

/**
 * Created by Pavel.Zhuk on 16.08.2016.
 */
class ColonFeature() : AbstractQuoteFeature() {
    override val name: String
        get() = "COLON"
    override fun getRegex(): Regex {
        return Regex("(.*[\\s\\xA0])?.*:([\\s\\xA0]*)?")
    }
}