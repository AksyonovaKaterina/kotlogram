package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.api.messages.TLAbsDhConfig
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesGetDhConfig() : TLMethod<TLAbsDhConfig>() {
    var version: Int = 0

    var randomLength: Int = 0

    private val _constructor: String = "messages.getDhConfig#26cf8950"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(version: Int, randomLength: Int) : this() {
        this.version = version
        this.randomLength = randomLength
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeInt(version)
        writeInt(randomLength)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        version = readInt()
        randomLength = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesGetDhConfig) return false
        if (other === this) return true

        return version == other.version
                && randomLength == other.randomLength
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x26cf8950
    }
}
