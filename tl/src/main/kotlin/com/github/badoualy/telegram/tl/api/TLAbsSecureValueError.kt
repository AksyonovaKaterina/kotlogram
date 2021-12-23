package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [secureValueError#869d758f][TLSecureValueError]
 * * [secureValueErrorData#e8a40bd9][TLSecureValueErrorData]
 * * [secureValueErrorFile#7a700873][TLSecureValueErrorFile]
 * * [secureValueErrorFiles#666220e9][TLSecureValueErrorFiles]
 * * [secureValueErrorFrontSide#be3dfa][TLSecureValueErrorFrontSide]
 * * [secureValueErrorReverseSide#868a2aa5][TLSecureValueErrorReverseSide]
 * * [secureValueErrorSelfie#e537ced6][TLSecureValueErrorSelfie]
 * * [secureValueErrorTranslationFile#a1144770][TLSecureValueErrorTranslationFile]
 * * [secureValueErrorTranslationFiles#34636dd8][TLSecureValueErrorTranslationFiles]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsSecureValueError : TLObject() {
    abstract var type: TLAbsSecureValueType

    abstract var text: String
}