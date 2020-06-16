package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TransformationFunction
 *
 * Full name:        System`TransformationFunction
 *
 * Usage:            TransformationFunction[data] represents a transformation function that applies geometric and other transformations.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TransformationFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransformationFunction.html
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
fun transformationFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransformationFunction", arguments.toMutableList(), options)
}
