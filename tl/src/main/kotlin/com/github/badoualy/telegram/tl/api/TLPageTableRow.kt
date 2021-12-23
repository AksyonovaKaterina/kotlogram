package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * pageTableRow#e0c0c5e5
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLPageTableRow() : TLObject() {
    var cells: TLObjectVector<TLPageTableCell> = TLObjectVector()

    private val _constructor: String = "pageTableRow#e0c0c5e5"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(cells: TLObjectVector<TLPageTableCell>) : this() {
        this.cells = cells
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLVector(cells)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        cells = readTLVector<TLPageTableCell>()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += cells.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLPageTableRow) return false
        if (other === this) return true

        return cells == other.cells
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xe0c0c5e5.toInt()
    }
}