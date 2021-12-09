package com.github.badoualy.telegram.tl.api

/**
 * updateLoginToken#564fe691
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdateLoginToken : TLAbsUpdate() {
    private val _constructor: String = "updateLoginToken#564fe691"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdateLoginToken) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x564fe691
    }
}
