package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LinearOffsetFunction
 *
 * Full name:        System`LinearOffsetFunction
 *
 * Usage:            LinearOffsetFunction is an option for linear and generalized linear model fitting functions that specifies a component for the model that is to be assumed known.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinearOffsetFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearOffsetFunction.html
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
fun linearOffsetFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearOffsetFunction", arguments.toMutableList(), options)
}
