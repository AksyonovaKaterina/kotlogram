package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLBytesSerializedSize
import com.github.badoualy.telegram.tl.api.account.TLTmpPassword
import com.github.badoualy.telegram.tl.core.TLBytes
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestAccountGetTmpPassword() : TLMethod<TLTmpPassword>() {
    var passwordHash: TLBytes = TLBytes.EMPTY

    var period: Int = 0

    private val _constructor: String = "account.getTmpPassword#4a82327e"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(passwordHash: TLBytes, period: Int) : this() {
        this.passwordHash = passwordHash
        this.period = period
    }

    @Throws(IOException::class)
    override fun deserializeResponse(tlDeserializer: TLDeserializer): TLTmpPassword = tlDeserializer.readTLObject(TLTmpPassword::class, TLTmpPassword.CONSTRUCTOR_ID)

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLBytes(passwordHash)
        writeInt(period)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        passwordHash = readTLBytes()
        period = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLBytesSerializedSize(passwordHash)
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestAccountGetTmpPassword) return false
        if (other === this) return true

        return passwordHash == other.passwordHash
                && period == other.period
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x4a82327e.toInt()
    }
}