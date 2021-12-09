package com.github.badoualy.telegram.tl.core

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLObjectVector<T : TLObject> : TLVector<T>() {

    override fun serializeItem(item: T, tlSerializer: TLSerializer) {
        tlSerializer.writeTLObject(item)
    }

    override fun deserializeItem(tlDeserializer: TLDeserializer): T = tlDeserializer.readTLObject()

    override fun computeSerializedSize() =
        SIZE_CONSTRUCTOR_ID + SIZE_INT32 + sumOf(TLObject::computeSerializedSize)
}