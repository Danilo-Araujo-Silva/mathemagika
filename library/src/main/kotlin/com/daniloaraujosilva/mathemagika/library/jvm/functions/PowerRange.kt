package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PowerRange
 *
 * Full name:        System`PowerRange
 *
 *                   PowerRange[b] generates the list {1, 10, 100, …, max}, where max is the largest power of 10 that does not exceed b.
 *                   PowerRange[a, b] generates the list {a, 10a, 100a, …, max}, with successive elements increasing by factors of 10.
 * Usage:            PowerRange[a, b, r] uses factors of r instead of 10.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PowerRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/PowerRange.html
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
fun powerRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PowerRange", arguments.toMutableList(), options)
}
