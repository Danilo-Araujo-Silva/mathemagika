package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NicholsGridLines
 *
 * Full name:        System`NicholsGridLines
 *
 * Usage:            NicholsGridLines is an option to NicholsPlot that specifies contours of constant magnitude and constant phase of the closed-loop system.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NicholsGridLines
 * Documentation:    web: http://reference.wolfram.com/language/ref/NicholsGridLines.html
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
fun nicholsGridLines(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NicholsGridLines", arguments.toMutableList(), options)
}
