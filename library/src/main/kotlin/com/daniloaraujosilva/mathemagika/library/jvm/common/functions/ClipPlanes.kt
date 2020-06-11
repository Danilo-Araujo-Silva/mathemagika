package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ClipPlanes
 *
 * Full name:        System`ClipPlanes
 *
 * Usage:            ClipPlanes is an option to Graphics3D that specifies a list of clipping planes that can cut away portions of a 3D scene from the resulting view.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ClipPlanes
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClipPlanes.html
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
fun clipPlanes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClipPlanes", arguments.toMutableList(), options)
}
