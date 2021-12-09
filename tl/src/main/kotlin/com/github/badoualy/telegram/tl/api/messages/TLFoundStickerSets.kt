package com.github.badoualy.telegram.tl.api.messages

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.api.TLAbsStickerSetCovered
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * messages.foundStickerSets#8af09dd2
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLFoundStickerSets() : TLAbsFoundStickerSets() {
    var hash: Long = 0L

    var sets: TLObjectVector<TLAbsStickerSetCovered> = TLObjectVector()

    private val _constructor: String = "messages.foundStickerSets#8af09dd2"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(hash: Long, sets: TLObjectVector<TLAbsStickerSetCovered>) : this() {
        this.hash = hash
        this.sets = sets
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeLong(hash)
        writeTLVector(sets)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        hash = readLong()
        sets = readTLVector<TLAbsStickerSetCovered>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT64
        size += sets.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLFoundStickerSets) return false
        if (other === this) return true

        return hash == other.hash
                && sets == other.sets
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x8af09dd2.toInt()
    }
}
