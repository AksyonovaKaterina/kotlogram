package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [phoneCall#967f7c67][TLPhoneCall]
 * * [phoneCallAccepted#3660c311][TLPhoneCallAccepted]
 * * [phoneCallDiscarded#50ca4de1][TLPhoneCallDiscarded]
 * * [phoneCallEmpty#5366c915][TLPhoneCallEmpty]
 * * [phoneCallRequested#14b0ed0c][TLPhoneCallRequested]
 * * [phoneCallWaiting#c5226f17][TLPhoneCallWaiting]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsPhoneCall : TLObject() {
    abstract var id: Long
}
