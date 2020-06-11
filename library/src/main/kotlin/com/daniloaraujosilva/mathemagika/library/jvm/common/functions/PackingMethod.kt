package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PackingMethod
 *
 * Full name:        System`PackingMethod
 *
 * Usage:            PackingMethod is an option for GraphPlot and related functions that specifies how disconnected components should be packed together in the layout produced.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PackingMethod
 * Documentation:    web: http://reference.wolfram.com/language/ref/PackingMethod.html
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
fun packingMethod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PackingMethod", arguments.toMutableList(), options)
}
