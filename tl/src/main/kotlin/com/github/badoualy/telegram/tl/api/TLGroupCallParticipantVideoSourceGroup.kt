package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.core.TLIntVector
import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * groupCallParticipantVideoSourceGroup#dcb118b7
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLGroupCallParticipantVideoSourceGroup() : TLObject() {
    var semantics: String = ""

    var sources: TLIntVector = TLIntVector()

    private val _constructor: String = "groupCallParticipantVideoSourceGroup#dcb118b7"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(semantics: String, sources: TLIntVector) : this() {
        this.semantics = semantics
        this.sources = sources
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeString(semantics)
        writeTLVector(sources)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        semantics = readString()
        sources = readTLIntVector()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLStringSerializedSize(semantics)
        size += sources.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLGroupCallParticipantVideoSourceGroup) return false
        if (other === this) return true

        return semantics == other.semantics
                && sources == other.sources
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xdcb118b7.toInt()
    }
}