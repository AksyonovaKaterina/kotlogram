package com.github.badoualy.telegram.tl.api

/**
 * updateDialogFilters#3504914f
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdateDialogFilters : TLAbsUpdate() {
    private val _constructor: String = "updateDialogFilters#3504914f"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdateDialogFilters) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x3504914f
    }
}
