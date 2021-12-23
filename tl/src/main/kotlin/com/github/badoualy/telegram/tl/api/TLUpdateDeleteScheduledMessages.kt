package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.core.TLIntVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * updateDeleteScheduledMessages#90866cee
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdateDeleteScheduledMessages() : TLAbsUpdate() {
    var peer: TLAbsPeer = TLPeerChat()

    var messages: TLIntVector = TLIntVector()

    private val _constructor: String = "updateDeleteScheduledMessages#90866cee"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(peer: TLAbsPeer, messages: TLIntVector) : this() {
        this.peer = peer
        this.messages = messages
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(peer)
        writeTLVector(messages)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        peer = readTLObject<TLAbsPeer>()
        messages = readTLIntVector()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += peer.computeSerializedSize()
        size += messages.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdateDeleteScheduledMessages) return false
        if (other === this) return true

        return peer == other.peer
                && messages == other.messages
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x90866cee.toInt()
    }
}