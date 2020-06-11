package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringToByteArray
 *
 * Full name:        System`StringToByteArray
 *
 *                   StringToByteArray["string"] returns a byte array corresponding to the UTF-8 encoding of the specified string.
 * Usage:            StringToByteArray["string", "encoding"] uses the specified character encoding.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringToByteArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringToByteArray.html
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
fun stringToByteArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringToByteArray", arguments.toMutableList(), options)
}
