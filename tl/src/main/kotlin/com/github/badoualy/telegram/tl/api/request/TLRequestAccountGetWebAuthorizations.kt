package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.api.account.TLWebAuthorizations
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestAccountGetWebAuthorizations : TLMethod<TLWebAuthorizations>() {
    private val _constructor: String = "account.getWebAuthorizations#182e6d6f"

    override val constructorId: Int = CONSTRUCTOR_ID

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLWebAuthorizations = tlDeserializer.readTLObject(TLWebAuthorizations::class, TLWebAuthorizations.CONSTRUCTOR_ID)

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestAccountGetWebAuthorizations) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x182e6d6f
    }
}