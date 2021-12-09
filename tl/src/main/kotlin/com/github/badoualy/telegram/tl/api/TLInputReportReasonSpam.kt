package com.github.badoualy.telegram.tl.api

/**
 * inputReportReasonSpam#58dbcab8
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLInputReportReasonSpam : TLAbsReportReason() {
    private val _constructor: String = "inputReportReasonSpam#58dbcab8"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLInputReportReasonSpam) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x58dbcab8
    }
}
