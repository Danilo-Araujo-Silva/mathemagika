package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ViewMatrix
 *
 * Full name:        System`ViewMatrix
 *
 * Usage:            ViewMatrix is an option for Graphics3D and related functions that can be used to specify a pair of explicit homogeneous transformation and projection matrices for 3D coordinates.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ViewMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/ViewMatrix.html
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
fun viewMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ViewMatrix", arguments.toMutableList(), options)
}
