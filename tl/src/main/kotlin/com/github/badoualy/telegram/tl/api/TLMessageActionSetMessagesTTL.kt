package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * messageActionSetMessagesTTL#aa1afbfd
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLMessageActionSetMessagesTTL() : TLAbsMessageAction() {
    var period: Int = 0

    private val _constructor: String = "messageActionSetMessagesTTL#aa1afbfd"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(period: Int) : this() {
        this.period = period
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeInt(period)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        period = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLMessageActionSetMessagesTTL) return false
        if (other === this) return true

        return period == other.period
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xaa1afbfd.toInt()
    }
}