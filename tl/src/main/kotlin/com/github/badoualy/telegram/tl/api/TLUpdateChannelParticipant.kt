package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * updateChannelParticipant#985d3abb
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdateChannelParticipant() : TLAbsUpdate() {
    var channelId: Long = 0L

    var date: Int = 0

    var actorId: Long = 0L

    var userId: Long = 0L

    var prevParticipant: TLAbsChannelParticipant? = null

    var newParticipant: TLAbsChannelParticipant? = null

    var invite: TLChatInviteExported? = null

    var qts: Int = 0

    private val _constructor: String = "updateChannelParticipant#985d3abb"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            channelId: Long,
            date: Int,
            actorId: Long,
            userId: Long,
            prevParticipant: TLAbsChannelParticipant?,
            newParticipant: TLAbsChannelParticipant?,
            invite: TLChatInviteExported?,
            qts: Int
    ) : this() {
        this.channelId = channelId
        this.date = date
        this.actorId = actorId
        this.userId = userId
        this.prevParticipant = prevParticipant
        this.newParticipant = newParticipant
        this.invite = invite
        this.qts = qts
    }

    override fun computeFlags() {
        _flags = 0
        updateFlags(prevParticipant, 1)
        updateFlags(newParticipant, 2)
        updateFlags(invite, 4)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
        writeLong(channelId)
        writeInt(date)
        writeLong(actorId)
        writeLong(userId)
        doIfMask(prevParticipant, 1) { writeTLObject(it) }
        doIfMask(newParticipant, 2) { writeTLObject(it) }
        doIfMask(invite, 4) { writeTLObject(it) }
        writeInt(qts)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        channelId = readLong()
        date = readInt()
        actorId = readLong()
        userId = readLong()
        prevParticipant = readIfMask(1) { readTLObject<TLAbsChannelParticipant>() }
        newParticipant = readIfMask(2) { readTLObject<TLAbsChannelParticipant>() }
        invite = readIfMask(4) { readTLObject<TLChatInviteExported>(TLChatInviteExported::class, TLChatInviteExported.CONSTRUCTOR_ID) }
        qts = readInt()
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += SIZE_INT64
        size += SIZE_INT32
        size += SIZE_INT64
        size += SIZE_INT64
        size += getIntIfMask(prevParticipant, 1) { it.computeSerializedSize() }
        size += getIntIfMask(newParticipant, 2) { it.computeSerializedSize() }
        size += getIntIfMask(invite, 4) { it.computeSerializedSize() }
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdateChannelParticipant) return false
        if (other === this) return true

        return _flags == other._flags
                && channelId == other.channelId
                && date == other.date
                && actorId == other.actorId
                && userId == other.userId
                && prevParticipant == other.prevParticipant
                && newParticipant == other.newParticipant
                && invite == other.invite
                && qts == other.qts
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x985d3abb.toInt()
    }
}