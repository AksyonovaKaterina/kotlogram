package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_BOOLEAN
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * channelAdminLogEventActionTogglePreHistoryHidden#5f5c95f1
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLChannelAdminLogEventActionTogglePreHistoryHidden() : TLAbsChannelAdminLogEventAction() {
    var newValue: Boolean = false

    private val _constructor: String = "channelAdminLogEventActionTogglePreHistoryHidden#5f5c95f1"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(newValue: Boolean) : this() {
        this.newValue = newValue
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeBoolean(newValue)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        newValue = readBoolean()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_BOOLEAN
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLChannelAdminLogEventActionTogglePreHistoryHidden) return false
        if (other === this) return true

        return newValue == other.newValue
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x5f5c95f1
    }
}
