package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ShearingTransform
 *
 * Full name:        System`ShearingTransform
 *
 *                   ShearingTransform[θ, v, n] gives a TransformationFunction that represents a shear by θ radians along the direction of the vector v, normal to the vector n, and keeping the origin fixed.
 * Usage:            ShearingTransform[θ, v, n, p] gives a shear that keeps the point p fixed, rather than the origin.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ShearingTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShearingTransform.html
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
fun shearingTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShearingTransform", arguments.toMutableList(), options)
}
