package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PerfectNumberQ
 *
 * Full name:        System`PerfectNumberQ
 *
 * Usage:            PerfectNumberQ[n] returns True if n is a perfect number, and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PerfectNumberQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/PerfectNumberQ.html
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
fun perfectNumberQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PerfectNumberQ", arguments.toMutableList(), options)
}
