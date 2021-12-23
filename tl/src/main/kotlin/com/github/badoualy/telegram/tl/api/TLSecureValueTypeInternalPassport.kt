package com.github.badoualy.telegram.tl.api

/**
 * secureValueTypeInternalPassport#99a48f23
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLSecureValueTypeInternalPassport : TLAbsSecureValueType() {
    private val _constructor: String = "secureValueTypeInternalPassport#99a48f23"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLSecureValueTypeInternalPassport) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x99a48f23.toInt()
    }
}