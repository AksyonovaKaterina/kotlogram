package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer
import com.github.badoualy.telegram.tl.api.TLAbsUpdates
import com.github.badoualy.telegram.tl.api.TLDataJSON
import com.github.badoualy.telegram.tl.api.TLInputGroupCall
import com.github.badoualy.telegram.tl.api.TLInputPeerEmpty
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestPhoneJoinGroupCall() : TLMethod<TLAbsUpdates>() {
    @Transient
    var muted: Boolean = false

    @Transient
    var videoStopped: Boolean = false

    var call: TLInputGroupCall = TLInputGroupCall()

    var joinAs: TLAbsInputPeer = TLInputPeerEmpty()

    var inviteHash: String? = null

    var params: TLDataJSON = TLDataJSON()

    private val _constructor: String = "phone.joinGroupCall#b132ff7b"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            muted: Boolean,
            videoStopped: Boolean,
            call: TLInputGroupCall,
            joinAs: TLAbsInputPeer,
            inviteHash: String?,
            params: TLDataJSON
    ) : this() {
        this.muted = muted
        this.videoStopped = videoStopped
        this.call = call
        this.joinAs = joinAs
        this.inviteHash = inviteHash
        this.params = params
    }

    override fun computeFlags() {
        _flags = 0
        updateFlags(muted, 1)
        updateFlags(videoStopped, 4)
        updateFlags(inviteHash, 2)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
        writeTLObject(call)
        writeTLObject(joinAs)
        doIfMask(inviteHash, 2) { writeString(it) }
        writeTLObject(params)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        muted = isMask(1)
        videoStopped = isMask(4)
        call = readTLObject<TLInputGroupCall>(TLInputGroupCall::class, TLInputGroupCall.CONSTRUCTOR_ID)
        joinAs = readTLObject<TLAbsInputPeer>()
        inviteHash = readIfMask(2) { readString() }
        params = readTLObject<TLDataJSON>(TLDataJSON::class, TLDataJSON.CONSTRUCTOR_ID)
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += call.computeSerializedSize()
        size += joinAs.computeSerializedSize()
        size += getIntIfMask(inviteHash, 2) { computeTLStringSerializedSize(it) }
        size += params.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestPhoneJoinGroupCall) return false
        if (other === this) return true

        return _flags == other._flags
                && muted == other.muted
                && videoStopped == other.videoStopped
                && call == other.call
                && joinAs == other.joinAs
                && inviteHash == other.inviteHash
                && params == other.params
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xb132ff7b.toInt()
    }
}
