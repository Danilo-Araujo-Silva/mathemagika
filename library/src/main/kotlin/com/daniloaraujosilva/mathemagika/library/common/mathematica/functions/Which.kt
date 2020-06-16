package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Which
 *
 * Full name:        System`Which
 *
 *                   Which[test , value , test , value , …] evaluates each of the test  in turn, returning the value of the value  corresponding to the first one that yields True.
 * Usage:                      1       1      2       2                               i                                          i
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Which
 * Documentation:    web: http://reference.wolfram.com/language/ref/Which.html
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
fun which(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Which", arguments.toMutableList(), options)
}
