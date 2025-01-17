package com.github.badoualy.telegram.tl.api.auth

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [auth.codeTypeCall#741cd3e3][TLCodeTypeCall]
 * * [auth.codeTypeFlashCall#226ccefb][TLCodeTypeFlashCall]
 * * [auth.codeTypeSms#72a3158c][TLCodeTypeSms]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsCodeType : TLObject()
