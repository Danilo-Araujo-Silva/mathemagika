package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ScalingTransform
 *
 * Full name:        System`ScalingTransform
 *
 *                   ScalingTransform[{s , s , …}] gives a TransformationFunction that represents scaling by a factor s  along each coordinate axis from the origin.
 *                                      x   y                                                                          i
 *                   ScalingTransform[{s , s , …}, p] gives scaling centered at the point p.
 *                                      x   y
 *                   ScalingTransform[s, v] gives scaling by a factor s along the direction of the vector v.
 * Usage:            ScalingTransform[s, v, p] gives scaling along the direction of v, centered at the point p.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScalingTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScalingTransform.html
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
fun scalingTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScalingTransform", arguments.toMutableList(), options)
}
