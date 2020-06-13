package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LoopFreeGraphQ
 *
 * Full name:        System`LoopFreeGraphQ
 *
 * Usage:            LoopFreeGraphQ[g] yields True if the graph g has no self-loops, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LoopFreeGraphQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/LoopFreeGraphQ.html
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
fun loopFreeGraphQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LoopFreeGraphQ", arguments.toMutableList(), options)
}
