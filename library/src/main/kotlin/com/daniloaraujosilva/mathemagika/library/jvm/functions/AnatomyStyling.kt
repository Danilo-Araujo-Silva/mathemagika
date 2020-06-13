package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AnatomyStyling
 *
 * Full name:        System`AnatomyStyling
 *
 * Usage:            AnatomyStyling[g] is a graphics directive used in AnatomyPlot3D that specifies how anatomy entity‐based graphics objects are to be drawn using the graphics directive or association of directives g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AnatomyStyling
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnatomyStyling.html
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
fun anatomyStyling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnatomyStyling", arguments.toMutableList(), options)
}
