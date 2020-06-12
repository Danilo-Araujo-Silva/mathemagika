package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PolarGridLines
 *
 * Full name:        System`PolarGridLines
 *
 * Usage:            PolarGridLines is an option for sector charts and polar plots that specifies polar grid lines.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PolarGridLines
 * Documentation:    web: http://reference.wolfram.com/language/ref/PolarGridLines.html
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
fun polarGridLines(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PolarGridLines", arguments.toMutableList(), options)
}
