package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EdgeLabels
 *
 * Full name:        System`EdgeLabels
 *
 * Usage:            EdgeLabels is an option and annotation for Graph and related functions that specifies what labels and label positions should be used for edges.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EdgeLabels
 * Documentation:    web: http://reference.wolfram.com/language/ref/EdgeLabels.html
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
fun edgeLabels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EdgeLabels", arguments.toMutableList(), options)
}
