package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LinearFractionalTransform
 * 
 * Full name:        System`LinearFractionalTransform
 * 
 *                   LinearFractionalTransform[m] gives a TransformationFunction that represents a linear fractional transformation defined by the homogeneous matrix m. 
 * Usage:            LinearFractionalTransform[{a, b, c, d}] represents a linear fractional transformation that maps r to (a . r + b)/(c . r + d). 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LinearFractionalTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearFractionalTransform.html
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
fun linearFractionalTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearFractionalTransform", arguments.toMutableList(), options)
}
