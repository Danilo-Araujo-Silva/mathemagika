package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BooleanVariables
 *
 * Full name:        System`BooleanVariables
 *
 *                   BooleanVariables[expr] gives a list of the Boolean variables in the Boolean expression expr.
 * Usage:            BooleanVariables[bf] gives the number of Boolean variables in the BooleanFunction object bf.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BooleanVariables
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanVariables.html
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
fun booleanVariables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanVariables", arguments.toMutableList(), options)
}
