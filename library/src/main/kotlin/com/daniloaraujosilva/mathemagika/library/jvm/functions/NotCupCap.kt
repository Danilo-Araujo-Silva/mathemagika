package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NotCupCap
 *
 * Full name:        System`NotCupCap
 *
 * Usage:            NotCupCap[x, y, …] displays as x ≭ y ≭ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotCupCap
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotCupCap.html
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
fun notCupCap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotCupCap", arguments.toMutableList(), options)
}
