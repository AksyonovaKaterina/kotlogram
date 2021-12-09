package com.github.badoualy.telegram.tl.api.auth

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * auth.sentCodeTypeCall#5353e5a7
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLSentCodeTypeCall() : TLAbsSentCodeType() {
    var length: Int = 0

    private val _constructor: String = "auth.sentCodeTypeCall#5353e5a7"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(length: Int) : this() {
        this.length = length
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeInt(length)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        length = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLSentCodeTypeCall) return false
        if (other === this) return true

        return length == other.length
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x5353e5a7
    }
}
