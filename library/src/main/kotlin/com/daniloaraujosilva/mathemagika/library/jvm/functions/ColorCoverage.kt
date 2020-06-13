package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ColorCoverage
 *
 * Full name:        System`ColorCoverage
 *
 * Usage:            ColorCoverage is an option for DominantColors that specifies the minimum image coverage that each color cluster should have.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorCoverage
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorCoverage.html
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
fun colorCoverage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorCoverage", arguments.toMutableList(), options)
}
