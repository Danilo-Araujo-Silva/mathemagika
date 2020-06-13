package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PartitionsP
 *
 * Full name:        System`PartitionsP
 *
 * Usage:            PartitionsP[n] gives the number p (n) of unrestricted partitions of the integer n.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PartitionsP
 * Documentation:    web: http://reference.wolfram.com/language/ref/PartitionsP.html
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
fun partitionsP(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PartitionsP", arguments.toMutableList(), options)
}
