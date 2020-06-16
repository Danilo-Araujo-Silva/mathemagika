package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BaseDecode
 *
 * Full name:        System`BaseDecode
 *
 * Usage:            BaseDecode["string"] decodes the Base64 data contained in a string and returns the result as a byte array.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BaseDecode
 * Documentation:    web: http://reference.wolfram.com/language/ref/BaseDecode.html
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
fun baseDecode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BaseDecode", arguments.toMutableList(), options)
}
