package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StringToStream
 *
 * Full name:        System`StringToStream
 *
 * Usage:            StringToStream["string"] opens an input stream for reading from a string.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringToStream
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringToStream.html
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
fun stringToStream(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringToStream", arguments.toMutableList(), options)
}
