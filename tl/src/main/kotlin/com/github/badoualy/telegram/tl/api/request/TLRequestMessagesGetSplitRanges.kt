package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.api.TLMessageRange
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesGetSplitRanges : TLMethod<TLObjectVector<TLMessageRange>>() {
    private val _constructor: String = "messages.getSplitRanges#1cff7e08"

    override val constructorId: Int = CONSTRUCTOR_ID

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLObjectVector<TLMessageRange> = tlDeserializer.readTLVector<TLMessageRange>()

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesGetSplitRanges) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x1cff7e08
    }
}
