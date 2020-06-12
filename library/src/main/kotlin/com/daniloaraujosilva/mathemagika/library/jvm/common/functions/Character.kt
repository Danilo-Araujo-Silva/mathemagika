package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Character
 *
 * Full name:        System`Character
 *
 * Usage:            Character represents a single character in Read.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Character
 * Documentation:    web: http://reference.wolfram.com/language/ref/Character.html
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
fun character(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Character", arguments.toMutableList(), options)
}