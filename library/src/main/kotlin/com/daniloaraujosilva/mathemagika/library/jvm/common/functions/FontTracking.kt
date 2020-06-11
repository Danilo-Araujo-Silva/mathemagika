package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FontTracking
 *
 * Full name:        System`FontTracking
 *
 * Usage:            FontTracking is an option for Style and Cell that specifies how condensed or expanded you want the font in which text is rendered to be.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FontTracking
 * Documentation:    web: http://reference.wolfram.com/language/ref/FontTracking.html
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
fun fontTracking(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FontTracking", arguments.toMutableList(), options)
}
