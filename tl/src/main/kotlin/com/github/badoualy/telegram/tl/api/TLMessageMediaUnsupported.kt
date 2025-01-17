package com.github.badoualy.telegram.tl.api

/**
 * messageMediaUnsupported#9f84f49e
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLMessageMediaUnsupported : TLAbsMessageMedia() {
    private val _constructor: String = "messageMediaUnsupported#9f84f49e"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLMessageMediaUnsupported) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x9f84f49e.toInt()
    }
}
