package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * jsonArray#f7444763
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLJsonArray() : TLAbsJSONValue() {
    var value: TLObjectVector<TLAbsJSONValue> = TLObjectVector()

    private val _constructor: String = "jsonArray#f7444763"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(value: TLObjectVector<TLAbsJSONValue>) : this() {
        this.value = value
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLVector(value)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        value = readTLVector<TLAbsJSONValue>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += value.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLJsonArray) return false
        if (other === this) return true

        return value == other.value
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xf7444763.toInt()
    }
}
