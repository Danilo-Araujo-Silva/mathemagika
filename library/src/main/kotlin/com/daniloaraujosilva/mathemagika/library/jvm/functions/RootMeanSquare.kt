package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RootMeanSquare
 *
 * Full name:        System`RootMeanSquare
 *
 *                   RootMeanSquare[list] gives the root mean square of values in list.
 * Usage:            RootMeanSquare[dist] gives the root mean square of the distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RootMeanSquare
 * Documentation:    web: http://reference.wolfram.com/language/ref/RootMeanSquare.html
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
fun rootMeanSquare(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RootMeanSquare", arguments.toMutableList(), options)
}
