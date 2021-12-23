package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [jsonArray#f7444763][TLJsonArray]
 * * [jsonBool#c7345e6a][TLJsonBool]
 * * [jsonNull#3f6d7b68][TLJsonNull]
 * * [jsonNumber#2be0dfa4][TLJsonNumber]
 * * [jsonObject#99c1d49d][TLJsonObject]
 * * [jsonString#b71e767a][TLJsonString]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsJSONValue : TLObject()