package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [chatInvite#dfc2f58e][TLChatInvite]
 * * [chatInviteAlready#5a686d7c][TLChatInviteAlready]
 * * [chatInvitePeek#61695cb0][TLChatInvitePeek]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsChatInvite : TLObject()
