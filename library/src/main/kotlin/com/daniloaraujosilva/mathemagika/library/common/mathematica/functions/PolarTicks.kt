package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PolarTicks
 *
 * Full name:        System`PolarTicks
 *
 * Usage:            PolarTicks is an option for sector charts and polar plots that specifies tick marks for polar axes.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolarTicks
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolarTicks.html
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
fun polarTicks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolarTicks", arguments.toMutableList(), options)
}
