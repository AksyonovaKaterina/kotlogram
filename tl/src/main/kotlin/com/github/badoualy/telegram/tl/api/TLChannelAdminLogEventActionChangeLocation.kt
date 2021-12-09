package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * channelAdminLogEventActionChangeLocation#e6b76ae
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLChannelAdminLogEventActionChangeLocation() : TLAbsChannelAdminLogEventAction() {
    var prevValue: TLAbsChannelLocation = TLChannelLocationEmpty()

    var newValue: TLAbsChannelLocation = TLChannelLocationEmpty()

    private val _constructor: String = "channelAdminLogEventActionChangeLocation#e6b76ae"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(prevValue: TLAbsChannelLocation, newValue: TLAbsChannelLocation) : this() {
        this.prevValue = prevValue
        this.newValue = newValue
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(prevValue)
        writeTLObject(newValue)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        prevValue = readTLObject<TLAbsChannelLocation>()
        newValue = readTLObject<TLAbsChannelLocation>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += prevValue.computeSerializedSize()
        size += newValue.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLChannelAdminLogEventActionChangeLocation) return false
        if (other === this) return true

        return prevValue == other.prevValue
                && newValue == other.newValue
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xe6b76ae
    }
}
