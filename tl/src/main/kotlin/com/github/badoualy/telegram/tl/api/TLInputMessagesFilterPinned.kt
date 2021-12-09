package com.github.badoualy.telegram.tl.api

/**
 * inputMessagesFilterPinned#1bb00451
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLInputMessagesFilterPinned : TLAbsMessagesFilter() {
    private val _constructor: String = "inputMessagesFilterPinned#1bb00451"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLInputMessagesFilterPinned) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x1bb00451
    }
}
