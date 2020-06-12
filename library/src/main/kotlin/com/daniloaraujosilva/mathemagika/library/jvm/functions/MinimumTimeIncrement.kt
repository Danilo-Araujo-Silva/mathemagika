package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MinimumTimeIncrement
 *
 * Full name:        System`MinimumTimeIncrement
 *
 * Usage:            MinimumTimeIncrement[tseries] gives the minimum time increment in the time series tseries.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinimumTimeIncrement
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinimumTimeIncrement.html
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
fun minimumTimeIncrement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinimumTimeIncrement", arguments.toMutableList(), options)
}
