package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * chatAdminWithInvites#f2ecef23
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLChatAdminWithInvites() : TLObject() {
    var adminId: Long = 0L

    var invitesCount: Int = 0

    var revokedInvitesCount: Int = 0

    private val _constructor: String = "chatAdminWithInvites#f2ecef23"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            adminId: Long,
            invitesCount: Int,
            revokedInvitesCount: Int
    ) : this() {
        this.adminId = adminId
        this.invitesCount = invitesCount
        this.revokedInvitesCount = revokedInvitesCount
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeLong(adminId)
        writeInt(invitesCount)
        writeInt(revokedInvitesCount)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        adminId = readLong()
        invitesCount = readInt()
        revokedInvitesCount = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT64
        size += SIZE_INT32
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLChatAdminWithInvites) return false
        if (other === this) return true

        return adminId == other.adminId
                && invitesCount == other.invitesCount
                && revokedInvitesCount == other.revokedInvitesCount
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xf2ecef23.toInt()
    }
}