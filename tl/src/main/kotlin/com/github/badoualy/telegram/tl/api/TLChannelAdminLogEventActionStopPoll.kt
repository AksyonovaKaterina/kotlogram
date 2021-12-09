package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * channelAdminLogEventActionStopPoll#8f079643
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLChannelAdminLogEventActionStopPoll() : TLAbsChannelAdminLogEventAction() {
    var message: TLAbsMessage = TLMessageEmpty()

    private val _constructor: String = "channelAdminLogEventActionStopPoll#8f079643"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(message: TLAbsMessage) : this() {
        this.message = message
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(message)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        message = readTLObject<TLAbsMessage>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += message.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLChannelAdminLogEventActionStopPoll) return false
        if (other === this) return true

        return message == other.message
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x8f079643.toInt()
    }
}
