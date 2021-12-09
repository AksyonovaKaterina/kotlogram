package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.api.TLGlobalPrivacySettings
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestAccountGetGlobalPrivacySettings : TLMethod<TLGlobalPrivacySettings>() {
    private val _constructor: String = "account.getGlobalPrivacySettings#eb2b4cf6"

    override val constructorId: Int = CONSTRUCTOR_ID

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLGlobalPrivacySettings = tlDeserializer.readTLObject(TLGlobalPrivacySettings::class, TLGlobalPrivacySettings.CONSTRUCTOR_ID)

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestAccountGetGlobalPrivacySettings) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xeb2b4cf6.toInt()
    }
}
