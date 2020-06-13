package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TransformationFunctions
 *
 * Full name:        System`TransformationFunctions
 *
 * Usage:            TransformationFunctions is an option for Simplify and FullSimplify which gives the list of functions to apply to try to transform parts of an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TransformationFunctions
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransformationFunctions.html
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
fun transformationFunctions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransformationFunctions", arguments.toMutableList(), options)
}
