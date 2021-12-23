package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * bankCardOpenUrl#f568028a
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLBankCardOpenUrl() : TLObject() {
    var url: String = ""

    var name: String = ""

    private val _constructor: String = "bankCardOpenUrl#f568028a"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(url: String, name: String) : this() {
        this.url = url
        this.name = name
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeString(url)
        writeString(name)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        url = readString()
        name = readString()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLStringSerializedSize(url)
        size += computeTLStringSerializedSize(name)
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLBankCardOpenUrl) return false
        if (other === this) return true

        return url == other.url
                && name == other.name
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xf568028a.toInt()
    }
}