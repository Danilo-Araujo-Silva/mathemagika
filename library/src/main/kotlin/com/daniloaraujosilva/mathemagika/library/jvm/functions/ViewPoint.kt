package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ViewPoint
 *
 * Full name:        System`ViewPoint
 *
 * Usage:            ViewPoint is an option for Graphics3D and related functions which gives the point in space from which three‐dimensional objects are to be viewed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ViewPoint
 * Documentation:    web: http://reference.wolfram.com/language/ref/ViewPoint.html
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
fun viewPoint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ViewPoint", arguments.toMutableList(), options)
}
