package com.github.badoualy.telegram.tl.api.account

/**
 * account.wallPapersNotModified#1c199183
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLWallPapersNotModified : TLAbsWallPapers() {
    private val _constructor: String = "account.wallPapersNotModified#1c199183"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLWallPapersNotModified) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x1c199183
    }
}
