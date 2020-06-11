package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LightSources
 *
 * Full name:        System`LightSources
 *
 * Usage:            LightSources is an option for Graphics3D and related functions that specifies the properties of point light sources for simulated illumination.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LightSources
 * Documentation:    web: http://reference.wolfram.com/language/ref/LightSources.html
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
fun lightSources(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LightSources", arguments.toMutableList(), options)
}
