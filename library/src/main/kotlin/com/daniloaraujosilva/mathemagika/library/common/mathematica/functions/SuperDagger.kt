package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SuperDagger
 *
 * Full name:        System`SuperDagger
 *
 *                                                     †
 * Usage:            SuperDagger[expr] displays as expr .
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SuperDagger
 * Documentation:    web: http://reference.wolfram.com/language/ref/SuperDagger.html
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
fun superDagger(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SuperDagger", arguments.toMutableList(), options)
}
