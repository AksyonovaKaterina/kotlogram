package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * inputSecureFile#5367e5be
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLInputSecureFile() : TLAbsInputSecureFile() {
    override var id: Long = 0L

    var accessHash: Long = 0L

    private val _constructor: String = "inputSecureFile#5367e5be"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(id: Long, accessHash: Long) : this() {
        this.id = id
        this.accessHash = accessHash
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeLong(id)
        writeLong(accessHash)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        id = readLong()
        accessHash = readLong()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT64
        size += SIZE_INT64
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLInputSecureFile) return false
        if (other === this) return true

        return id == other.id
                && accessHash == other.accessHash
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x5367e5be
    }
}
