package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteVariables
 *
 * Full name:        System`DiscreteVariables
 *
 * Usage:            DiscreteVariables is an option for NDSolve and other functions that specifies variables that only change at discrete times in a temporal integration.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DiscreteVariables
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteVariables.html
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
fun discreteVariables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteVariables", arguments.toMutableList(), options)
}
