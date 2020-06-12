package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PartitionsQ
 *
 * Full name:        System`PartitionsQ
 *
 * Usage:            PartitionsQ[n] gives the number q (n) of partitions of the integer n into distinct parts.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PartitionsQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PartitionsQ.html
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
fun partitionsQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PartitionsQ", arguments.toMutableList(), options)
}
