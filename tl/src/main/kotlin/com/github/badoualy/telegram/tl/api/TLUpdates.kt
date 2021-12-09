package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * updates#74ae4240
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdates() : TLAbsUpdates() {
    var updates: TLObjectVector<TLAbsUpdate> = TLObjectVector()

    var users: TLObjectVector<TLAbsUser> = TLObjectVector()

    var chats: TLObjectVector<TLAbsChat> = TLObjectVector()

    var date: Int = 0

    var seq: Int = 0

    private val _constructor: String = "updates#74ae4240"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            updates: TLObjectVector<TLAbsUpdate>,
            users: TLObjectVector<TLAbsUser>,
            chats: TLObjectVector<TLAbsChat>,
            date: Int,
            seq: Int
    ) : this() {
        this.updates = updates
        this.users = users
        this.chats = chats
        this.date = date
        this.seq = seq
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLVector(updates)
        writeTLVector(users)
        writeTLVector(chats)
        writeInt(date)
        writeInt(seq)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        updates = readTLVector<TLAbsUpdate>()
        users = readTLVector<TLAbsUser>()
        chats = readTLVector<TLAbsChat>()
        date = readInt()
        seq = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += updates.computeSerializedSize()
        size += users.computeSerializedSize()
        size += chats.computeSerializedSize()
        size += SIZE_INT32
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdates) return false
        if (other === this) return true

        return updates == other.updates
                && users == other.users
                && chats == other.chats
                && date == other.date
                && seq == other.seq
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x74ae4240
    }
}
