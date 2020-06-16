package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BooleanStrings
 *
 * Full name:        System`BooleanStrings
 *
 * Usage:            BooleanStrings is an option to TextString and related functions that determines what strings correspond to the Wolfram Language symbols True and False.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BooleanStrings
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanStrings.html
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
fun booleanStrings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanStrings", arguments.toMutableList(), options)
}
