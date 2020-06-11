package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReflectionMatrix
 *
 * Full name:        System`ReflectionMatrix
 *
 * Usage:            ReflectionMatrix[v] gives the matrix that represents reflection of points in a mirror normal to the vector v.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ReflectionMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReflectionMatrix.html
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
fun reflectionMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReflectionMatrix", arguments.toMutableList(), options)
}
