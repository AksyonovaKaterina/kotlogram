package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [inputPaymentCredentials#3417d728][TLInputPaymentCredentials]
 * * [inputPaymentCredentialsApplePay#aa1c39f][TLInputPaymentCredentialsApplePay]
 * * [inputPaymentCredentialsGooglePay#8ac32801][TLInputPaymentCredentialsGooglePay]
 * * [inputPaymentCredentialsSaved#c10eb2cf][TLInputPaymentCredentialsSaved]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsInputPaymentCredentials : TLObject()
