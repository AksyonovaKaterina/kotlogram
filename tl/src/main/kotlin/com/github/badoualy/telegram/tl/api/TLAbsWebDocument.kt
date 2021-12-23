package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.core.TLObjectVector

/**
 * Abstraction level for the following constructors:
 * * [webDocument#1c570ed1][TLWebDocument]
 * * [webDocumentNoProxy#f9c8bcc6][TLWebDocumentNoProxy]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsWebDocument : TLObject() {
    abstract var url: String

    abstract var size: Int

    abstract var mimeType: String

    abstract var attributes: TLObjectVector<TLAbsDocumentAttribute>
}