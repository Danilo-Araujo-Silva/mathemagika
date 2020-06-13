package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ExponentialFamily
 *
 * Full name:        System`ExponentialFamily
 *
 * Usage:            ExponentialFamily is an option for GeneralizedLinearModelFit that specifies the exponential family for the model.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExponentialFamily
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExponentialFamily.html
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
fun exponentialFamily(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExponentialFamily", arguments.toMutableList(), options)
}
