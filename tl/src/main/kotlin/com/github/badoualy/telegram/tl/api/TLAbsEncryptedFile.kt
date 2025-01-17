package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [encryptedFile#4a70994c][TLEncryptedFile]
 * * [encryptedFileEmpty#c21f497e][TLEncryptedFileEmpty]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsEncryptedFile : TLObject() {
    fun isEmpty(): Boolean = this is TLEncryptedFileEmpty

    fun isNotEmpty(): Boolean = this is TLEncryptedFile

    fun asEncryptedFile(): TLEncryptedFile? = this as? TLEncryptedFile
}
