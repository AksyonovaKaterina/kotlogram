package com.github.badoualy.telegram.tl.api

/**
 * botCommandScopeDefault#2f6cb2ab
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLBotCommandScopeDefault : TLAbsBotCommandScope() {
    private val _constructor: String = "botCommandScopeDefault#2f6cb2ab"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLBotCommandScopeDefault) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x2f6cb2ab
    }
}