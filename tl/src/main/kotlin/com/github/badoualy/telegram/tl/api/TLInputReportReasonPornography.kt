package com.github.badoualy.telegram.tl.api

/**
 * inputReportReasonPornography#2e59d922
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLInputReportReasonPornography : TLAbsReportReason() {
    private val _constructor: String = "inputReportReasonPornography#2e59d922"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLInputReportReasonPornography) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x2e59d922
    }
}
