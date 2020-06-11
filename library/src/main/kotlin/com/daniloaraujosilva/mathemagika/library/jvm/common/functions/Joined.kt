package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Joined
 *
 * Full name:        System`Joined
 *
 * Usage:            Joined is an option for ListPlot and related functions that specifies whether points in each dataset should be joined into a line, or should be plotted as separate points.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Joined
 * Documentation:    web: http://reference.wolfram.com/language/ref/Joined.html
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
fun joined(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Joined", arguments.toMutableList(), options)
}
