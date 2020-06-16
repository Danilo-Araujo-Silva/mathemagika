package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StartingStepSize
 *
 * Full name:        System`StartingStepSize
 *
 * Usage:            StartingStepSize is an option to NDSolve and related functions that specifies the initial step size to use in trying to generate results.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StartingStepSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/StartingStepSize.html
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
fun startingStepSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StartingStepSize", arguments.toMutableList(), options)
}
