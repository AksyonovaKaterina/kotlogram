package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.core.TLIntVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * updatePinnedMessages#ed85eab5
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdatePinnedMessages() : TLAbsUpdate() {
    @Transient
    var pinned: Boolean = false

    var peer: TLAbsPeer = TLPeerChat()

    var messages: TLIntVector = TLIntVector()

    var pts: Int = 0

    var ptsCount: Int = 0

    private val _constructor: String = "updatePinnedMessages#ed85eab5"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            pinned: Boolean,
            peer: TLAbsPeer,
            messages: TLIntVector,
            pts: Int,
            ptsCount: Int
    ) : this() {
        this.pinned = pinned
        this.peer = peer
        this.messages = messages
        this.pts = pts
        this.ptsCount = ptsCount
    }

    override fun computeFlags() {
        _flags = 0
        updateFlags(pinned, 1)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
        writeTLObject(peer)
        writeTLVector(messages)
        writeInt(pts)
        writeInt(ptsCount)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        pinned = isMask(1)
        peer = readTLObject<TLAbsPeer>()
        messages = readTLIntVector()
        pts = readInt()
        ptsCount = readInt()
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += peer.computeSerializedSize()
        size += messages.computeSerializedSize()
        size += SIZE_INT32
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdatePinnedMessages) return false
        if (other === this) return true

        return _flags == other._flags
                && pinned == other.pinned
                && peer == other.peer
                && messages == other.messages
                && pts == other.pts
                && ptsCount == other.ptsCount
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xed85eab5.toInt()
    }
}