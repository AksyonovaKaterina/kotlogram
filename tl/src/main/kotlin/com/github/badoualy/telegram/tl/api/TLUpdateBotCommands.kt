package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * updateBotCommands#4d712f2e
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdateBotCommands() : TLAbsUpdate() {
    var peer: TLAbsPeer = TLPeerChat()

    var botId: Long = 0L

    var commands: TLObjectVector<TLBotCommand> = TLObjectVector()

    private val _constructor: String = "updateBotCommands#4d712f2e"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            peer: TLAbsPeer,
            botId: Long,
            commands: TLObjectVector<TLBotCommand>
    ) : this() {
        this.peer = peer
        this.botId = botId
        this.commands = commands
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(peer)
        writeLong(botId)
        writeTLVector(commands)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        peer = readTLObject<TLAbsPeer>()
        botId = readLong()
        commands = readTLVector<TLBotCommand>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += peer.computeSerializedSize()
        size += SIZE_INT64
        size += commands.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdateBotCommands) return false
        if (other === this) return true

        return peer == other.peer
                && botId == other.botId
                && commands == other.commands
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x4d712f2e
    }
}