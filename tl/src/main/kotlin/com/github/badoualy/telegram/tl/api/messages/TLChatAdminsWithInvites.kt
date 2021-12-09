package com.github.badoualy.telegram.tl.api.messages

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.api.TLAbsUser
import com.github.badoualy.telegram.tl.api.TLChatAdminWithInvites
import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * messages.chatAdminsWithInvites#b69b72d7
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLChatAdminsWithInvites() : TLObject() {
    var admins: TLObjectVector<TLChatAdminWithInvites> = TLObjectVector()

    var users: TLObjectVector<TLAbsUser> = TLObjectVector()

    private val _constructor: String = "messages.chatAdminsWithInvites#b69b72d7"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(admins: TLObjectVector<TLChatAdminWithInvites>, users: TLObjectVector<TLAbsUser>) : this() {
        this.admins = admins
        this.users = users
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLVector(admins)
        writeTLVector(users)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        admins = readTLVector<TLChatAdminWithInvites>()
        users = readTLVector<TLAbsUser>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += admins.computeSerializedSize()
        size += users.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLChatAdminsWithInvites) return false
        if (other === this) return true

        return admins == other.admins
                && users == other.users
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xb69b72d7.toInt()
    }
}
