package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.api.TLLangPackLanguage
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestLangpackGetLanguage() : TLMethod<TLLangPackLanguage>() {
    var langPack: String = ""

    var langCode: String = ""

    private val _constructor: String = "langpack.getLanguage#6a596502"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(langPack: String, langCode: String) : this() {
        this.langPack = langPack
        this.langCode = langCode
    }

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLLangPackLanguage = tlDeserializer.readTLObject(TLLangPackLanguage::class, TLLangPackLanguage.CONSTRUCTOR_ID)

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeString(langPack)
        writeString(langCode)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        langPack = readString()
        langCode = readString()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLStringSerializedSize(langPack)
        size += computeTLStringSerializedSize(langCode)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestLangpackGetLanguage) return false
        if (other === this) return true

        return langPack == other.langPack
                && langCode == other.langCode
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x6a596502
    }
}