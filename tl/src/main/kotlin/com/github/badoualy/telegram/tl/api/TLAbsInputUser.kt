package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [inputUser#f21158c6][TLInputUser]
 * * [inputUserEmpty#b98886cf][TLInputUserEmpty]
 * * [inputUserFromMessage#1da448e2][TLInputUserFromMessage]
 * * [inputUserSelf#f7c1b13f][TLInputUserSelf]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsInputUser : TLObject()
