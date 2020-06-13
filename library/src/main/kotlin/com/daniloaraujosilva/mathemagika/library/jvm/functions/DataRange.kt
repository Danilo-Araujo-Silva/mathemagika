package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DataRange
 *
 * Full name:        System`DataRange
 *
 * Usage:            DataRange is an option for functions such as ListPlot and ListDensityPlot that specifies what range of actual coordinates the data should be assumed to occupy.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DataRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/DataRange.html
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
fun dataRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DataRange", arguments.toMutableList(), options)
}
