package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AmbientLight
 *
 * Full name:        System`AmbientLight
 *
 * Usage:            AmbientLight is an option for Graphics3D and related functions that gives the level of simulated ambient illumination in a three-dimensional picture.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AmbientLight
 * Documentation:    web: http://reference.wolfram.com/language/ref/AmbientLight.html
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
fun ambientLight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AmbientLight", arguments.toMutableList(), options)
}
