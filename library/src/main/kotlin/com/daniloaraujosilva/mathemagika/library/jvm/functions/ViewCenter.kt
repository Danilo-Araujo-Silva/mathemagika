package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ViewCenter
 *
 * Full name:        System`ViewCenter
 *
 * Usage:            ViewCenter is an option for Graphics3D and related functions which gives the scaled coordinates of the point which should appear at the center of the final image.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ViewCenter
 * Documentation:    web: http://reference.wolfram.com/language/ref/ViewCenter.html
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
fun viewCenter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ViewCenter", arguments.toMutableList(), options)
}
