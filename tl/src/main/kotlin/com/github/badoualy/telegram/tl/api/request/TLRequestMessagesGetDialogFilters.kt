package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.api.TLDialogFilter
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesGetDialogFilters : TLMethod<TLObjectVector<TLDialogFilter>>() {
    private val _constructor: String = "messages.getDialogFilters#f19ed96d"

    override val constructorId: Int = CONSTRUCTOR_ID

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLObjectVector<TLDialogFilter> = tlDeserializer.readTLVector<TLDialogFilter>()

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesGetDialogFilters) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xf19ed96d.toInt()
    }
}
