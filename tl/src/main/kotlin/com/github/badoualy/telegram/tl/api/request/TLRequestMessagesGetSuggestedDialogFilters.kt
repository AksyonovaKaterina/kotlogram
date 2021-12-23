package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.api.TLDialogFilterSuggested
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesGetSuggestedDialogFilters : TLMethod<TLObjectVector<TLDialogFilterSuggested>>() {
    private val _constructor: String = "messages.getSuggestedDialogFilters#a29cd42c"

    override val constructorId: Int = CONSTRUCTOR_ID

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLObjectVector<TLDialogFilterSuggested> = tlDeserializer.readTLVector<TLDialogFilterSuggested>()

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesGetSuggestedDialogFilters) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xa29cd42c.toInt()
    }
}