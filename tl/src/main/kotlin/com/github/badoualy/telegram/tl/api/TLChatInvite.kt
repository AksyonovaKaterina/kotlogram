package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * chatInvite#dfc2f58e
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLChatInvite() : TLAbsChatInvite() {
    @Transient
    var channel: Boolean = false

    @Transient
    var broadcast: Boolean = false

    @Transient
    var _public: Boolean = false

    @Transient
    var megagroup: Boolean = false

    var title: String = ""

    var photo: TLAbsPhoto = TLPhotoEmpty()

    var participantsCount: Int = 0

    var participants: TLObjectVector<TLAbsUser>? = TLObjectVector()

    private val _constructor: String = "chatInvite#dfc2f58e"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            channel: Boolean,
            broadcast: Boolean,
            _public: Boolean,
            megagroup: Boolean,
            title: String,
            photo: TLAbsPhoto,
            participantsCount: Int,
            participants: TLObjectVector<TLAbsUser>?
    ) : this() {
        this.channel = channel
        this.broadcast = broadcast
        this._public = _public
        this.megagroup = megagroup
        this.title = title
        this.photo = photo
        this.participantsCount = participantsCount
        this.participants = participants
    }

    override fun computeFlags() {
        _flags = 0
        updateFlags(channel, 1)
        updateFlags(broadcast, 2)
        updateFlags(_public, 4)
        updateFlags(megagroup, 8)
        updateFlags(participants, 16)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
        writeString(title)
        writeTLObject(photo)
        writeInt(participantsCount)
        doIfMask(participants, 16) { writeTLVector(it) }
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        channel = isMask(1)
        broadcast = isMask(2)
        _public = isMask(4)
        megagroup = isMask(8)
        title = readString()
        photo = readTLObject<TLAbsPhoto>()
        participantsCount = readInt()
        participants = readIfMask(16) { readTLVector<TLAbsUser>() }
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += computeTLStringSerializedSize(title)
        size += photo.computeSerializedSize()
        size += SIZE_INT32
        size += getIntIfMask(participants, 16) { it.computeSerializedSize() }
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLChatInvite) return false
        if (other === this) return true

        return _flags == other._flags
                && channel == other.channel
                && broadcast == other.broadcast
                && _public == other._public
                && megagroup == other.megagroup
                && title == other.title
                && photo == other.photo
                && participantsCount == other.participantsCount
                && participants == other.participants
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xdfc2f58e.toInt()
    }
}
