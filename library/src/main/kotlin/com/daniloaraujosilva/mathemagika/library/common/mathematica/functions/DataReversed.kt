package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DataReversed
 *
 * Full name:        System`DataReversed
 *
 * Usage:            DataReversed is an option for ArrayPlot and related functions that specifies whether data should be plotted in reverse order.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DataReversed
 * Documentation:    web: http://reference.wolfram.com/language/ref/DataReversed.html
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
fun dataReversed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DataReversed", arguments.toMutableList(), options)
}
