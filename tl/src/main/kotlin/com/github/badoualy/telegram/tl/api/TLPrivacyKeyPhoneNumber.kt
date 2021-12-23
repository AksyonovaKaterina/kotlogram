package com.github.badoualy.telegram.tl.api

/**
 * privacyKeyPhoneNumber#d19ae46d
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLPrivacyKeyPhoneNumber : TLAbsPrivacyKey() {
    private val _constructor: String = "privacyKeyPhoneNumber#d19ae46d"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLPrivacyKeyPhoneNumber) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xd19ae46d.toInt()
    }
}