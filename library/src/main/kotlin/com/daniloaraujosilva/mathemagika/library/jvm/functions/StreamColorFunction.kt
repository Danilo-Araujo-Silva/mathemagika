package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StreamColorFunction
 *
 * Full name:        System`StreamColorFunction
 *
 * Usage:            StreamColorFunction is an option for StreamPlot and related functions that specifies a function to apply to determine colors along streamlines.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StreamColorFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/StreamColorFunction.html
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
fun streamColorFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StreamColorFunction", arguments.toMutableList(), options)
}
