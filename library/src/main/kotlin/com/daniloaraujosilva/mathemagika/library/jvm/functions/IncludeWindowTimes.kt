package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeWindowTimes
 *
 * Full name:        System`IncludeWindowTimes
 *
 * Usage:            IncludeWindowTimes is an option to TimeSeriesWindow that specifies whether the endpoints in the time window should be included.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IncludeWindowTimes
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeWindowTimes.html
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
fun includeWindowTimes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeWindowTimes", arguments.toMutableList(), options)
}
