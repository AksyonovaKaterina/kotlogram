package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.api.TLAbsInputPhoto
import com.github.badoualy.telegram.tl.api.TLInputPhotoEmpty
import com.github.badoualy.telegram.tl.api.photos.TLPhoto
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestPhotosUpdateProfilePhoto() : TLMethod<TLPhoto>() {
    var id: TLAbsInputPhoto = TLInputPhotoEmpty()

    private val _constructor: String = "photos.updateProfilePhoto#72d4742c"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(id: TLAbsInputPhoto) : this() {
        this.id = id
    }

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLPhoto = tlDeserializer.readTLObject(TLPhoto::class, TLPhoto.CONSTRUCTOR_ID)

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(id)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        id = readTLObject<TLAbsInputPhoto>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += id.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestPhotosUpdateProfilePhoto) return false
        if (other === this) return true

        return id == other.id
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x72d4742c
    }
}
