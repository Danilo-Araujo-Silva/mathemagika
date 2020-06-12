package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CharacterEncoding
 *
 * Full name:        System`CharacterEncoding
 *
 * Usage:            CharacterEncoding is an option for input and output functions which specifies what raw character encoding should be used.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CharacterEncoding
 * Documentation:    web: http://reference.wolfram.com/language/ref/CharacterEncoding.html
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
fun characterEncoding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CharacterEncoding", arguments.toMutableList(), options)
}
