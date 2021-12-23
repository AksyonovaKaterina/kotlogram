package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * inputWebFileGeoPointLocation#9f2221c9
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLInputWebFileGeoPointLocation() : TLAbsInputWebFileLocation() {
    var geoPoint: TLAbsInputGeoPoint = TLInputGeoPointEmpty()

    override var accessHash: Long = 0L

    var w: Int = 0

    var h: Int = 0

    var zoom: Int = 0

    var scale: Int = 0

    private val _constructor: String = "inputWebFileGeoPointLocation#9f2221c9"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            geoPoint: TLAbsInputGeoPoint,
            accessHash: Long,
            w: Int,
            h: Int,
            zoom: Int,
            scale: Int
    ) : this() {
        this.geoPoint = geoPoint
        this.accessHash = accessHash
        this.w = w
        this.h = h
        this.zoom = zoom
        this.scale = scale
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(geoPoint)
        writeLong(accessHash)
        writeInt(w)
        writeInt(h)
        writeInt(zoom)
        writeInt(scale)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        geoPoint = readTLObject<TLAbsInputGeoPoint>()
        accessHash = readLong()
        w = readInt()
        h = readInt()
        zoom = readInt()
        scale = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += geoPoint.computeSerializedSize()
        size += SIZE_INT64
        size += SIZE_INT32
        size += SIZE_INT32
        size += SIZE_INT32
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLInputWebFileGeoPointLocation) return false
        if (other === this) return true

        return geoPoint == other.geoPoint
                && accessHash == other.accessHash
                && w == other.w
                && h == other.h
                && zoom == other.zoom
                && scale == other.scale
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x9f2221c9.toInt()
    }
}