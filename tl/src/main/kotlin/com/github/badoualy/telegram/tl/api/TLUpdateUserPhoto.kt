package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_BOOLEAN
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * updateUserPhoto#f227868c
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdateUserPhoto() : TLAbsUpdate() {
    var userId: Long = 0L

    var date: Int = 0

    var photo: TLAbsUserProfilePhoto = TLUserProfilePhotoEmpty()

    var previous: Boolean = false

    private val _constructor: String = "updateUserPhoto#f227868c"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            userId: Long,
            date: Int,
            photo: TLAbsUserProfilePhoto,
            previous: Boolean
    ) : this() {
        this.userId = userId
        this.date = date
        this.photo = photo
        this.previous = previous
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeLong(userId)
        writeInt(date)
        writeTLObject(photo)
        writeBoolean(previous)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        userId = readLong()
        date = readInt()
        photo = readTLObject<TLAbsUserProfilePhoto>()
        previous = readBoolean()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT64
        size += SIZE_INT32
        size += photo.computeSerializedSize()
        size += SIZE_BOOLEAN
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdateUserPhoto) return false
        if (other === this) return true

        return userId == other.userId
                && date == other.date
                && photo == other.photo
                && previous == other.previous
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xf227868c.toInt()
    }
}
