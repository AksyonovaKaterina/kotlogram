package com.github.badoualy.telegram.tl.api.account

/**
 * account.themesNotModified#f41eb622
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLThemesNotModified : TLAbsThemes() {
    private val _constructor: String = "account.themesNotModified#f41eb622"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLThemesNotModified) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xf41eb622.toInt()
    }
}
