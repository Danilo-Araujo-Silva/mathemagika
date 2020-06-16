package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BoxRatios
 *
 * Full name:        System`BoxRatios
 *
 * Usage:            BoxRatios is an option for Graphics3D that gives the ratios of side lengths for the bounding box of the three‐dimensional picture.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BoxRatios
 * Documentation:    web: http://reference.wolfram.com/language/ref/BoxRatios.html
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
fun boxRatios(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BoxRatios", arguments.toMutableList(), options)
}
