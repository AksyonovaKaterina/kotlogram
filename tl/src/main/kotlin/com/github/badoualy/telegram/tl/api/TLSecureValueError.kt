package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLBytesSerializedSize
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.core.TLBytes
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * secureValueError#869d758f
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLSecureValueError() : TLAbsSecureValueError() {
    override var type: TLAbsSecureValueType = TLSecureValueTypeAddress()

    var hash: TLBytes = TLBytes.EMPTY

    override var text: String = ""

    private val _constructor: String = "secureValueError#869d758f"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            type: TLAbsSecureValueType,
            hash: TLBytes,
            text: String
    ) : this() {
        this.type = type
        this.hash = hash
        this.text = text
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(type)
        writeTLBytes(hash)
        writeString(text)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        type = readTLObject<TLAbsSecureValueType>()
        hash = readTLBytes()
        text = readString()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += type.computeSerializedSize()
        size += computeTLBytesSerializedSize(hash)
        size += computeTLStringSerializedSize(text)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLSecureValueError) return false
        if (other === this) return true

        return type == other.type
                && hash == other.hash
                && text == other.text
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x869d758f.toInt()
    }
}