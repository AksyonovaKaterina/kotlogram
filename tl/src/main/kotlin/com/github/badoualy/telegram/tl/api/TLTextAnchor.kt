package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * textAnchor#35553762
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLTextAnchor() : TLAbsRichText() {
    var text: TLAbsRichText = TLTextEmpty()

    var name: String = ""

    private val _constructor: String = "textAnchor#35553762"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(text: TLAbsRichText, name: String) : this() {
        this.text = text
        this.name = name
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(text)
        writeString(name)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        text = readTLObject<TLAbsRichText>()
        name = readString()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += text.computeSerializedSize()
        size += computeTLStringSerializedSize(name)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLTextAnchor) return false
        if (other === this) return true

        return text == other.text
                && name == other.name
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x35553762
    }
}