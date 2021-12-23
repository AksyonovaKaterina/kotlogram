package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLBytesSerializedSize
import com.github.badoualy.telegram.tl.core.TLBytes
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * secureFile#e0277a62
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLSecureFile() : TLAbsSecureFile() {
    var id: Long = 0L

    var accessHash: Long = 0L

    var size: Int = 0

    var dcId: Int = 0

    var date: Int = 0

    var fileHash: TLBytes = TLBytes.EMPTY

    var secret: TLBytes = TLBytes.EMPTY

    private val _constructor: String = "secureFile#e0277a62"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            id: Long,
            accessHash: Long,
            size: Int,
            dcId: Int,
            date: Int,
            fileHash: TLBytes,
            secret: TLBytes
    ) : this() {
        this.id = id
        this.accessHash = accessHash
        this.size = size
        this.dcId = dcId
        this.date = date
        this.fileHash = fileHash
        this.secret = secret
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeLong(id)
        writeLong(accessHash)
        writeInt(size)
        writeInt(dcId)
        writeInt(date)
        writeTLBytes(fileHash)
        writeTLBytes(secret)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        id = readLong()
        accessHash = readLong()
        size = readInt()
        dcId = readInt()
        date = readInt()
        fileHash = readTLBytes()
        secret = readTLBytes()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT64
        size += SIZE_INT64
        size += SIZE_INT32
        size += SIZE_INT32
        size += SIZE_INT32
        size += computeTLBytesSerializedSize(fileHash)
        size += computeTLBytesSerializedSize(secret)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLSecureFile) return false
        if (other === this) return true

        return id == other.id
                && accessHash == other.accessHash
                && size == other.size
                && dcId == other.dcId
                && date == other.date
                && fileHash == other.fileHash
                && secret == other.secret
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xe0277a62.toInt()
    }
}