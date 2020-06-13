package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BaseEncode
 *
 * Full name:        System`BaseEncode
 *
 * Usage:            BaseEncode[ba] encodes the byte array ba as a Base64 string.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BaseEncode
 * Documentation:    web: http://reference.wolfram.com/language/ref/BaseEncode.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun baseEncode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BaseEncode", arguments.toMutableList(), options)
}
