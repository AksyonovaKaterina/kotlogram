package com.github.badoualy.telegram.tl.api.help

/**
 * help.passportConfigNotModified#bfb9f457
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLPassportConfigNotModified : TLAbsPassportConfig() {
    private val _constructor: String = "help.passportConfigNotModified#bfb9f457"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLPassportConfigNotModified) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xbfb9f457.toInt()
    }
}
