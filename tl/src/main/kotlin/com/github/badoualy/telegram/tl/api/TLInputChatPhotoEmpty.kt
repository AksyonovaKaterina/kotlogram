package com.github.badoualy.telegram.tl.api

/**
 * inputChatPhotoEmpty#1ca48f57
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLInputChatPhotoEmpty : TLAbsInputChatPhoto() {
    private val _constructor: String = "inputChatPhotoEmpty#1ca48f57"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLInputChatPhotoEmpty) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x1ca48f57
    }
}
