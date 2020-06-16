package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LinkFunction
 *
 * Full name:        System`LinkFunction
 *
 * Usage:            LinkFunction is an option for GeneralizedLinearModelFit that specifies the link function for the generalized linear model.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinkFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkFunction.html
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
fun linkFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkFunction", arguments.toMutableList(), options)
}
