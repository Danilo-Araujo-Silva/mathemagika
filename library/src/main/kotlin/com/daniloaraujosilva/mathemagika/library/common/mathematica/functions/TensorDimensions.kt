package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TensorDimensions
 *
 * Full name:        System`TensorDimensions
 *
 * Usage:            TensorDimensions[tensor] gives the list of dimensions of tensor.
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TensorDimensions
 * Documentation:    web: http://reference.wolfram.com/language/ref/TensorDimensions.html
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
fun tensorDimensions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TensorDimensions", arguments.toMutableList(), options)
}
