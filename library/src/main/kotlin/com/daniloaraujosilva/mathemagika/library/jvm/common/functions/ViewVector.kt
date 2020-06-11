package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ViewVector
 *
 * Full name:        System`ViewVector
 *
 * Usage:            ViewVector is an option for Graphics3D and related functions which specifies the position and direction of a simulated camera used to view three-dimensional objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ViewVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/ViewVector.html
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
fun viewVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ViewVector", arguments.toMutableList(), options)
}
