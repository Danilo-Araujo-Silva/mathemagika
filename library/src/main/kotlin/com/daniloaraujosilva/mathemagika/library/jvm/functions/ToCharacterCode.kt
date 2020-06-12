package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ToCharacterCode
 *
 * Full name:        System`ToCharacterCode
 *
 *                   ToCharacterCode["string"] gives a list of the integer codes corresponding to the characters in a string.
 * Usage:            ToCharacterCode["string", "encoding"] gives integer codes according to the specified encoding.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ToCharacterCode
 * Documentation:    web: http://reference.wolfram.com/language/ref/ToCharacterCode.html
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
fun toCharacterCode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ToCharacterCode", arguments.toMutableList(), options)
}
