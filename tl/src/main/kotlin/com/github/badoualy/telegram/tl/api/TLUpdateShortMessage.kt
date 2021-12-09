package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * updateShortMessage#313bc7f8
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdateShortMessage() : TLAbsUpdates() {
    @Transient
    var out: Boolean = false

    @Transient
    var mentioned: Boolean = false

    @Transient
    var mediaUnread: Boolean = false

    @Transient
    var silent: Boolean = false

    var id: Int = 0

    var userId: Long = 0L

    var message: String = ""

    var pts: Int = 0

    var ptsCount: Int = 0

    var date: Int = 0

    var fwdFrom: TLMessageFwdHeader? = null

    var viaBotId: Long? = null

    var replyTo: TLMessageReplyHeader? = null

    var entities: TLObjectVector<TLAbsMessageEntity>? = TLObjectVector()

    var ttlPeriod: Int? = null

    private val _constructor: String = "updateShortMessage#313bc7f8"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            out: Boolean,
            mentioned: Boolean,
            mediaUnread: Boolean,
            silent: Boolean,
            id: Int,
            userId: Long,
            message: String,
            pts: Int,
            ptsCount: Int,
            date: Int,
            fwdFrom: TLMessageFwdHeader?,
            viaBotId: Long?,
            replyTo: TLMessageReplyHeader?,
            entities: TLObjectVector<TLAbsMessageEntity>?,
            ttlPeriod: Int?
    ) : this() {
        this.out = out
        this.mentioned = mentioned
        this.mediaUnread = mediaUnread
        this.silent = silent
        this.id = id
        this.userId = userId
        this.message = message
        this.pts = pts
        this.ptsCount = ptsCount
        this.date = date
        this.fwdFrom = fwdFrom
        this.viaBotId = viaBotId
        this.replyTo = replyTo
        this.entities = entities
        this.ttlPeriod = ttlPeriod
    }

    override fun computeFlags() {
        _flags = 0
        updateFlags(out, 2)
        updateFlags(mentioned, 16)
        updateFlags(mediaUnread, 32)
        updateFlags(silent, 8192)
        updateFlags(fwdFrom, 4)
        updateFlags(viaBotId, 2048)
        updateFlags(replyTo, 8)
        updateFlags(entities, 128)
        updateFlags(ttlPeriod, 33554432)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
        writeInt(id)
        writeLong(userId)
        writeString(message)
        writeInt(pts)
        writeInt(ptsCount)
        writeInt(date)
        doIfMask(fwdFrom, 4) { writeTLObject(it) }
        doIfMask(viaBotId, 2048) { writeLong(it) }
        doIfMask(replyTo, 8) { writeTLObject(it) }
        doIfMask(entities, 128) { writeTLVector(it) }
        doIfMask(ttlPeriod, 33554432) { writeInt(it) }
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        out = isMask(2)
        mentioned = isMask(16)
        mediaUnread = isMask(32)
        silent = isMask(8192)
        id = readInt()
        userId = readLong()
        message = readString()
        pts = readInt()
        ptsCount = readInt()
        date = readInt()
        fwdFrom = readIfMask(4) { readTLObject<TLMessageFwdHeader>(TLMessageFwdHeader::class, TLMessageFwdHeader.CONSTRUCTOR_ID) }
        viaBotId = readIfMask(2048) { readLong() }
        replyTo = readIfMask(8) { readTLObject<TLMessageReplyHeader>(TLMessageReplyHeader::class, TLMessageReplyHeader.CONSTRUCTOR_ID) }
        entities = readIfMask(128) { readTLVector<TLAbsMessageEntity>() }
        ttlPeriod = readIfMask(33554432) { readInt() }
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += SIZE_INT32
        size += SIZE_INT64
        size += computeTLStringSerializedSize(message)
        size += SIZE_INT32
        size += SIZE_INT32
        size += SIZE_INT32
        size += getIntIfMask(fwdFrom, 4) { it.computeSerializedSize() }
        size += getIntIfMask(viaBotId, 2048) { SIZE_INT64 }
        size += getIntIfMask(replyTo, 8) { it.computeSerializedSize() }
        size += getIntIfMask(entities, 128) { it.computeSerializedSize() }
        size += getIntIfMask(ttlPeriod, 33554432) { SIZE_INT32 }
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdateShortMessage) return false
        if (other === this) return true

        return _flags == other._flags
                && out == other.out
                && mentioned == other.mentioned
                && mediaUnread == other.mediaUnread
                && silent == other.silent
                && id == other.id
                && userId == other.userId
                && message == other.message
                && pts == other.pts
                && ptsCount == other.ptsCount
                && date == other.date
                && fwdFrom == other.fwdFrom
                && viaBotId == other.viaBotId
                && replyTo == other.replyTo
                && entities == other.entities
                && ttlPeriod == other.ttlPeriod
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x313bc7f8
    }
}
