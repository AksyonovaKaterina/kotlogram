package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * sendMessageHistoryImportAction#dbda9246
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLSendMessageHistoryImportAction() : TLAbsSendMessageAction() {
    var progress: Int = 0

    private val _constructor: String = "sendMessageHistoryImportAction#dbda9246"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(progress: Int) : this() {
        this.progress = progress
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeInt(progress)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        progress = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLSendMessageHistoryImportAction) return false
        if (other === this) return true

        return progress == other.progress
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xdbda9246.toInt()
    }
}
