package com.github.badoualy.telegram.tl.api

/**
 * notifyBroadcasts#d612e8ef
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLNotifyBroadcasts : TLAbsNotifyPeer() {
    private val _constructor: String = "notifyBroadcasts#d612e8ef"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLNotifyBroadcasts) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xd612e8ef.toInt()
    }
}
