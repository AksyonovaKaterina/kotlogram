package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * inputMediaDocument#33473058
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLInputMediaDocument() : TLAbsInputMedia() {
    var id: TLAbsInputDocument = TLInputDocumentEmpty()

    var ttlSeconds: Int? = null

    var query: String? = null

    private val _constructor: String = "inputMediaDocument#33473058"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            id: TLAbsInputDocument,
            ttlSeconds: Int?,
            query: String?
    ) : this() {
        this.id = id
        this.ttlSeconds = ttlSeconds
        this.query = query
    }

    override fun computeFlags() {
        _flags = 0
        updateFlags(ttlSeconds, 1)
        updateFlags(query, 2)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
        writeTLObject(id)
        doIfMask(ttlSeconds, 1) { writeInt(it) }
        doIfMask(query, 2) { writeString(it) }
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        id = readTLObject<TLAbsInputDocument>()
        ttlSeconds = readIfMask(1) { readInt() }
        query = readIfMask(2) { readString() }
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += id.computeSerializedSize()
        size += getIntIfMask(ttlSeconds, 1) { SIZE_INT32 }
        size += getIntIfMask(query, 2) { computeTLStringSerializedSize(it) }
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLInputMediaDocument) return false
        if (other === this) return true

        return _flags == other._flags
                && id == other.id
                && ttlSeconds == other.ttlSeconds
                && query == other.query
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x33473058
    }
}
