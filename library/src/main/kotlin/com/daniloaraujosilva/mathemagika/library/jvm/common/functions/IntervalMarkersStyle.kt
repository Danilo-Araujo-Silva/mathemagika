package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IntervalMarkersStyle
 *
 * Full name:        System`IntervalMarkersStyle
 *
 * Usage:            IntervalMarkersStyle  is an option for plotting functions that specifies styles in which uncertainty intervals are drawn.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IntervalMarkersStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntervalMarkersStyle.html
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
fun intervalMarkersStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntervalMarkersStyle", arguments.toMutableList(), options)
}
