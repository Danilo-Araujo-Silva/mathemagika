package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExternalDataCharacterEncoding
 *
 * Full name:        System`ExternalDataCharacterEncoding
 *
 * Usage:            ExternalDataCharacterEncoding is a global option that specifies the character encoding used in reading and writing plain text data outside of the Wolfram System.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExternalDataCharacterEncoding
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalDataCharacterEncoding.html
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
fun externalDataCharacterEncoding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalDataCharacterEncoding", arguments.toMutableList(), options)
}
