package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             UpdateInterval
 *
 * Full name:        System`UpdateInterval
 *
 * Usage:            UpdateInterval is an option to Refresh and Dynamic that specifies at what time interval to do updates.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UpdateInterval
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpdateInterval.html
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
fun updateInterval(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpdateInterval", arguments.toMutableList(), options)
}
