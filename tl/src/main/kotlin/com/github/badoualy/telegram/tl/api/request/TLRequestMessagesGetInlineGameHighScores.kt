package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.api.TLAbsInputBotInlineMessageID
import com.github.badoualy.telegram.tl.api.TLAbsInputUser
import com.github.badoualy.telegram.tl.api.TLInputBotInlineMessageID
import com.github.badoualy.telegram.tl.api.TLInputUserEmpty
import com.github.badoualy.telegram.tl.api.messages.TLHighScores
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesGetInlineGameHighScores() : TLMethod<TLHighScores>() {
    var id: TLAbsInputBotInlineMessageID = TLInputBotInlineMessageID()

    var userId: TLAbsInputUser = TLInputUserEmpty()

    private val _constructor: String = "messages.getInlineGameHighScores#f635e1b"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(id: TLAbsInputBotInlineMessageID, userId: TLAbsInputUser) : this() {
        this.id = id
        this.userId = userId
    }

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLHighScores = tlDeserializer.readTLObject(TLHighScores::class, TLHighScores.CONSTRUCTOR_ID)

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(id)
        writeTLObject(userId)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        id = readTLObject<TLAbsInputBotInlineMessageID>()
        userId = readTLObject<TLAbsInputUser>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += id.computeSerializedSize()
        size += userId.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesGetInlineGameHighScores) return false
        if (other === this) return true

        return id == other.id
                && userId == other.userId
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xf635e1b
    }
}
