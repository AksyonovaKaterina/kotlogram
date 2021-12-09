package com.github.badoualy.telegram.tl.api

/**
 * geoPointEmpty#1117dd5f
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLGeoPointEmpty : TLAbsGeoPoint() {
    private val _constructor: String = "geoPointEmpty#1117dd5f"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLGeoPointEmpty) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x1117dd5f
    }
}
