package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT64
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.api.TLAbsInputMedia
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer
import com.github.badoualy.telegram.tl.api.TLAbsMessageMedia
import com.github.badoualy.telegram.tl.api.TLInputMediaEmpty
import com.github.badoualy.telegram.tl.api.TLInputPeerEmpty
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesUploadImportedMedia() : TLMethod<TLAbsMessageMedia>() {
    var peer: TLAbsInputPeer = TLInputPeerEmpty()

    var importId: Long = 0L

    var fileName: String = ""

    var media: TLAbsInputMedia = TLInputMediaEmpty()

    private val _constructor: String = "messages.uploadImportedMedia#2a862092"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            peer: TLAbsInputPeer,
            importId: Long,
            fileName: String,
            media: TLAbsInputMedia
    ) : this() {
        this.peer = peer
        this.importId = importId
        this.fileName = fileName
        this.media = media
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(peer)
        writeLong(importId)
        writeString(fileName)
        writeTLObject(media)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        peer = readTLObject<TLAbsInputPeer>()
        importId = readLong()
        fileName = readString()
        media = readTLObject<TLAbsInputMedia>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += peer.computeSerializedSize()
        size += SIZE_INT64
        size += computeTLStringSerializedSize(fileName)
        size += media.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesUploadImportedMedia) return false
        if (other === this) return true

        return peer == other.peer
                && importId == other.importId
                && fileName == other.fileName
                && media == other.media
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x2a862092
    }
}