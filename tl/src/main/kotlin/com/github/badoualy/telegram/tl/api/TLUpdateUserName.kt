package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * updateUserName#c3f202e0
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLUpdateUserName() : TLAbsUpdate() {
    var userId: Long = 0L

    var firstName: String = ""

    var lastName: String = ""

    var username: String = ""

    private val _constructor: String = "updateUserName#c3f202e0"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            userId: Long,
            firstName: String,
            lastName: String,
            username: String
    ) : this() {
        this.userId = userId
        this.firstName = firstName
        this.lastName = lastName
        this.username = username
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeLong(userId)
        writeString(firstName)
        writeString(lastName)
        writeString(username)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        userId = readLong()
        firstName = readString()
        lastName = readString()
        username = readString()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT64
        size += computeTLStringSerializedSize(firstName)
        size += computeTLStringSerializedSize(lastName)
        size += computeTLStringSerializedSize(username)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLUpdateUserName) return false
        if (other === this) return true

        return userId == other.userId
                && firstName == other.firstName
                && lastName == other.lastName
                && username == other.username
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xc3f202e0.toInt()
    }
}
