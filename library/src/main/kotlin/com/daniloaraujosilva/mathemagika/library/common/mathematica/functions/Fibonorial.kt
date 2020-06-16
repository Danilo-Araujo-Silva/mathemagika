package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Fibonorial
 *
 * Full name:        System`Fibonorial
 *
 *                   Fibonorial[n] gives the fibonorial n ! .
 * Usage:                                                  F
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Fibonorial
 * Documentation:    web: http://reference.wolfram.com/language/ref/Fibonorial.html
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
fun fibonorial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Fibonorial", arguments.toMutableList(), options)
}
