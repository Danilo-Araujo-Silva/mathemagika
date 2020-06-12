package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AxesLabel
 *
 * Full name:        System`AxesLabel
 *
 * Usage:            AxesLabel is an option for graphics functions that specifies labels for axes.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AxesLabel
 * Documentation:    web: http://reference.wolfram.com/language/ref/AxesLabel.html
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
fun axesLabel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AxesLabel", arguments.toMutableList(), options)
}
