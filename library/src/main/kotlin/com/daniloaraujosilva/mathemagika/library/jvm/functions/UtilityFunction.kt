package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             UtilityFunction
 *
 * Full name:        System`UtilityFunction
 *
 * Usage:            UtilityFunction is an option for Predict, Classify, and related functions that specifies the utility value to assign to each possible pairing of actual and predicted values.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UtilityFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/UtilityFunction.html
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
fun utilityFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UtilityFunction", arguments.toMutableList(), options)
}
