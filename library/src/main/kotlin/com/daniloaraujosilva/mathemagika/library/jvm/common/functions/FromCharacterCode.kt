package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FromCharacterCode
 *
 * Full name:        System`FromCharacterCode
 *
 *                   FromCharacterCode[n] gives a string consisting of the character with integer code n.
 *                   FromCharacterCode[{n , n , …}] gives a string consisting of the sequence of characters with codes n .
 *                                       1   2                                                                          i
 *                   FromCharacterCode[{{n  , n  , …}, {n  , …}, …}] gives a list of strings.
 *                                        11   12        21
 * Usage:            FromCharacterCode[…, "encoding"] uses the specified character encoding.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FromCharacterCode
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromCharacterCode.html
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
fun fromCharacterCode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromCharacterCode", arguments.toMutableList(), options)
}
