package com.github.badoualy.telegram.tl.api

/**
 * secureValueTypeEmail#8e3ca7ee
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLSecureValueTypeEmail : TLAbsSecureValueType() {
    private val _constructor: String = "secureValueTypeEmail#8e3ca7ee"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLSecureValueTypeEmail) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x8e3ca7ee.toInt()
    }
}
