package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Split
 *
 * Full name:        System`Split
 *
 *                   Split[list] splits list into sublists consisting of runs of identical elements.
 * Usage:            Split[list, test] treats pairs of adjacent elements as identical whenever applying the function test to them yields True.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Split
 * Documentation:    web: http://reference.wolfram.com/language/ref/Split.html
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
fun split(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Split", arguments.toMutableList(), options)
}
