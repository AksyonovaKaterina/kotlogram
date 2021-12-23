package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.api.messages.TLAffectedFoundMessages
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesDeletePhoneCallHistory() : TLMethod<TLAffectedFoundMessages>() {
    @Transient
    var revoke: Boolean = false

    private val _constructor: String = "messages.deletePhoneCallHistory#f9cbe409"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(revoke: Boolean) : this() {
        this.revoke = revoke
    }

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLAffectedFoundMessages = tlDeserializer.readTLObject(TLAffectedFoundMessages::class, TLAffectedFoundMessages.CONSTRUCTOR_ID)

    override fun computeFlags() {
        _flags = 0
        updateFlags(revoke, 1)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        revoke = isMask(1)
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesDeletePhoneCallHistory) return false
        if (other === this) return true

        return _flags == other._flags
                && revoke == other.revoke
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xf9cbe409.toInt()
    }
}