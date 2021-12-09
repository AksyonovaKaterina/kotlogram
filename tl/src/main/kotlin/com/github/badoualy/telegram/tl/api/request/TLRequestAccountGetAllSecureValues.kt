package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.api.TLSecureValue
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestAccountGetAllSecureValues : TLMethod<TLObjectVector<TLSecureValue>>() {
    private val _constructor: String = "account.getAllSecureValues#b288bc7d"

    override val constructorId: Int = CONSTRUCTOR_ID

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLObjectVector<TLSecureValue> = tlDeserializer.readTLVector<TLSecureValue>()

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestAccountGetAllSecureValues) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xb288bc7d.toInt()
    }
}
