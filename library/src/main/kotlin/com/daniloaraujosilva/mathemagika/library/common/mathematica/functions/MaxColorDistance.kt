package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MaxColorDistance
 *
 * Full name:        System`MaxColorDistance
 *
 * Usage:            MaxColorDistance is an option to specify the maximum distance allowed between colors.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxColorDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxColorDistance.html
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
fun maxColorDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxColorDistance", arguments.toMutableList(), options)
}
