package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MemoryConstrained
 *
 * Full name:        System`MemoryConstrained
 *
 *                   MemoryConstrained[expr, b] evaluates expr, stopping if more than b bytes of memory are requested.
 * Usage:            MemoryConstrained[expr, b, failexpr] returns failexpr if the memory constraint is not met.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MemoryConstrained
 * Documentation:    web: http://reference.wolfram.com/language/ref/MemoryConstrained.html
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
fun memoryConstrained(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MemoryConstrained", arguments.toMutableList(), options)
}
