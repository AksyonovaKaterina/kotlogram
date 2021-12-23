package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLBytesSerializedSize
import com.github.badoualy.telegram.tl.core.TLBytes
import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * secureData#8aeabec3
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLSecureData() : TLObject() {
    var data: TLBytes = TLBytes.EMPTY

    var dataHash: TLBytes = TLBytes.EMPTY

    var secret: TLBytes = TLBytes.EMPTY

    private val _constructor: String = "secureData#8aeabec3"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            data: TLBytes,
            dataHash: TLBytes,
            secret: TLBytes
    ) : this() {
        this.data = data
        this.dataHash = dataHash
        this.secret = secret
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLBytes(data)
        writeTLBytes(dataHash)
        writeTLBytes(secret)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        data = readTLBytes()
        dataHash = readTLBytes()
        secret = readTLBytes()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLBytesSerializedSize(data)
        size += computeTLBytesSerializedSize(dataHash)
        size += computeTLBytesSerializedSize(secret)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLSecureData) return false
        if (other === this) return true

        return data == other.data
                && dataHash == other.dataHash
                && secret == other.secret
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x8aeabec3.toInt()
    }
}