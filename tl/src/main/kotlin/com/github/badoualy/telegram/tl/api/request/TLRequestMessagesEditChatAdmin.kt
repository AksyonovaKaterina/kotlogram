package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_BOOLEAN
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.api.TLAbsInputUser
import com.github.badoualy.telegram.tl.api.TLInputUserEmpty
import com.github.badoualy.telegram.tl.core.TLBool
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesEditChatAdmin() : TLMethod<TLBool>() {
    var chatId: Long = 0L

    var userId: TLAbsInputUser = TLInputUserEmpty()

    var isAdmin: Boolean = false

    private val _constructor: String = "messages.editChatAdmin#a85bd1c2"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            chatId: Long,
            userId: TLAbsInputUser,
            isAdmin: Boolean
    ) : this() {
        this.chatId = chatId
        this.userId = userId
        this.isAdmin = isAdmin
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeLong(chatId)
        writeTLObject(userId)
        writeBoolean(isAdmin)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        chatId = readLong()
        userId = readTLObject<TLAbsInputUser>()
        isAdmin = readBoolean()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT64
        size += userId.computeSerializedSize()
        size += SIZE_BOOLEAN
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesEditChatAdmin) return false
        if (other === this) return true

        return chatId == other.chatId
                && userId == other.userId
                && isAdmin == other.isAdmin
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xa85bd1c2.toInt()
    }
}
