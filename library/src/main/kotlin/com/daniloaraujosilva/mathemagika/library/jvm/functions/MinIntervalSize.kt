package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MinIntervalSize
 *
 * Full name:        System`MinIntervalSize
 *
 * Usage:            MinIntervalSize is an option for IntervalSlider that specifies the minimum size of the interval during interactive editing.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MinIntervalSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinIntervalSize.html
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
fun minIntervalSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinIntervalSize", arguments.toMutableList(), options)
}
