package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * botInlineResult#11965f3a
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLBotInlineResult() : TLAbsBotInlineResult() {
    override var id: String = ""

    override var type: String = ""

    var title: String? = null

    var description: String? = null

    var url: String? = null

    var thumb: TLAbsWebDocument? = null

    var content: TLAbsWebDocument? = null

    override var sendMessage: TLAbsBotInlineMessage = TLBotInlineMessageMediaAuto()

    private val _constructor: String = "botInlineResult#11965f3a"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            id: String,
            type: String,
            title: String?,
            description: String?,
            url: String?,
            thumb: TLAbsWebDocument?,
            content: TLAbsWebDocument?,
            sendMessage: TLAbsBotInlineMessage
    ) : this() {
        this.id = id
        this.type = type
        this.title = title
        this.description = description
        this.url = url
        this.thumb = thumb
        this.content = content
        this.sendMessage = sendMessage
    }

    override fun computeFlags() {
        _flags = 0
        updateFlags(title, 2)
        updateFlags(description, 4)
        updateFlags(url, 8)
        updateFlags(thumb, 16)
        updateFlags(content, 32)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
        writeString(id)
        writeString(type)
        doIfMask(title, 2) { writeString(it) }
        doIfMask(description, 4) { writeString(it) }
        doIfMask(url, 8) { writeString(it) }
        doIfMask(thumb, 16) { writeTLObject(it) }
        doIfMask(content, 32) { writeTLObject(it) }
        writeTLObject(sendMessage)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        id = readString()
        type = readString()
        title = readIfMask(2) { readString() }
        description = readIfMask(4) { readString() }
        url = readIfMask(8) { readString() }
        thumb = readIfMask(16) { readTLObject<TLAbsWebDocument>() }
        content = readIfMask(32) { readTLObject<TLAbsWebDocument>() }
        sendMessage = readTLObject<TLAbsBotInlineMessage>()
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += computeTLStringSerializedSize(id)
        size += computeTLStringSerializedSize(type)
        size += getIntIfMask(title, 2) { computeTLStringSerializedSize(it) }
        size += getIntIfMask(description, 4) { computeTLStringSerializedSize(it) }
        size += getIntIfMask(url, 8) { computeTLStringSerializedSize(it) }
        size += getIntIfMask(thumb, 16) { it.computeSerializedSize() }
        size += getIntIfMask(content, 32) { it.computeSerializedSize() }
        size += sendMessage.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLBotInlineResult) return false
        if (other === this) return true

        return _flags == other._flags
                && id == other.id
                && type == other.type
                && title == other.title
                && description == other.description
                && url == other.url
                && thumb == other.thumb
                && content == other.content
                && sendMessage == other.sendMessage
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x11965f3a
    }
}
