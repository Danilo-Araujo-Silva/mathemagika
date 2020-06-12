package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetTake
 *
 * Full name:        System`NetTake
 *
 *                   NetTake[net, end] takes only those layers up to end in a NetChain or NetGraph.
 * Usage:            NetTake[net, {start, end}] takes only those layers between start and end in a NetChain or NetGraph.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetTake
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetTake.html
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
fun netTake(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetTake", arguments.toMutableList(), options)
}
