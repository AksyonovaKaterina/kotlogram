package com.github.badoualy.telegram.tl.api.stickers

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * stickers.suggestedShortName#85fea03f
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLSuggestedShortName() : TLObject() {
    var shortName: String = ""

    private val _constructor: String = "stickers.suggestedShortName#85fea03f"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(shortName: String) : this() {
        this.shortName = shortName
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeString(shortName)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        shortName = readString()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLStringSerializedSize(shortName)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLSuggestedShortName) return false
        if (other === this) return true

        return shortName == other.shortName
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x85fea03f.toInt()
    }
}
