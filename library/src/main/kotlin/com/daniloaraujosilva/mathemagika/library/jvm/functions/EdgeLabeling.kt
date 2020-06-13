package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeLabeling
 *
 * Full name:        System`EdgeLabeling
 *
 * Usage:            EdgeLabeling is an option for GraphPlot and related functions that specifies whether labeling specified for edges should be displayed by default.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeLabeling
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeLabeling.html
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
fun edgeLabeling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeLabeling", arguments.toMutableList(), options)
}
