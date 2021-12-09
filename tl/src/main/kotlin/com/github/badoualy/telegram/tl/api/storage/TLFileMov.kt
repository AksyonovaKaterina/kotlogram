package com.github.badoualy.telegram.tl.api.storage

/**
 * storage.fileMov#4b09ebbc
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLFileMov : TLAbsFileType() {
    private val _constructor: String = "storage.fileMov#4b09ebbc"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLFileMov) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x4b09ebbc
    }
}
