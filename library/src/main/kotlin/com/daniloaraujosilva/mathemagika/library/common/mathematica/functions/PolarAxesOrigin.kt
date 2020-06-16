package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PolarAxesOrigin
 *
 * Full name:        System`PolarAxesOrigin
 *
 * Usage:            PolarAxesOrigin is an option for sector charts and polar plots that specifies where polar axes should be drawn.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolarAxesOrigin
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolarAxesOrigin.html
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
fun polarAxesOrigin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolarAxesOrigin", arguments.toMutableList(), options)
}
