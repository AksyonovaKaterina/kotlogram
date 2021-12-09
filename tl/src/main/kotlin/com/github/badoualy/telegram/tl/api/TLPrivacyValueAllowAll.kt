package com.github.badoualy.telegram.tl.api

/**
 * privacyValueAllowAll#65427b82
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLPrivacyValueAllowAll : TLAbsPrivacyRule() {
    private val _constructor: String = "privacyValueAllowAll#65427b82"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLPrivacyValueAllowAll) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x65427b82
    }
}
