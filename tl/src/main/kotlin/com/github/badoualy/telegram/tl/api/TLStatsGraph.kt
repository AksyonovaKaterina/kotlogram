package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * statsGraph#8ea464b6
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLStatsGraph() : TLAbsStatsGraph() {
    var json: TLDataJSON = TLDataJSON()

    var zoomToken: String? = null

    private val _constructor: String = "statsGraph#8ea464b6"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(json: TLDataJSON, zoomToken: String?) : this() {
        this.json = json
        this.zoomToken = zoomToken
    }

    override fun computeFlags() {
        _flags = 0
        updateFlags(zoomToken, 1)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
        writeTLObject(json)
        doIfMask(zoomToken, 1) { writeString(it) }
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        json = readTLObject<TLDataJSON>(TLDataJSON::class, TLDataJSON.CONSTRUCTOR_ID)
        zoomToken = readIfMask(1) { readString() }
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += json.computeSerializedSize()
        size += getIntIfMask(zoomToken, 1) { computeTLStringSerializedSize(it) }
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLStatsGraph) return false
        if (other === this) return true

        return _flags == other._flags
                && json == other.json
                && zoomToken == other.zoomToken
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x8ea464b6.toInt()
    }
}