package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             UnconstrainedParameters
 * 
 * Full name:        System`UnconstrainedParameters
 * 
 * Usage:            UnconstrainedParameters is an option to functions like GeometricScene that specifies what parameters should be treated as unconstrained, so that they can take on any possible value.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/UnconstrainedParameters
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnconstrainedParameters.html
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
fun unconstrainedParameters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnconstrainedParameters", arguments.toMutableList(), options)
}
