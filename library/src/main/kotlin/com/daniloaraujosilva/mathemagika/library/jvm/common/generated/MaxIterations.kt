package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MaxIterations
 * 
 * Full name:        System`MaxIterations
 * 
 * Usage:            MaxIterations is an option that specifies the maximum number of iterations that should be tried in various built-in functions and algorithms.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/MaxIterations
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxIterations.html
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
fun maxIterations(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxIterations", arguments.toMutableList(), options)
}
