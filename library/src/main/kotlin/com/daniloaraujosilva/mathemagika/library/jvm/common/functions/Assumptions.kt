package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Assumptions
 *
 * Full name:        System`Assumptions
 *
 * Usage:            Assumptions is an option for functions such as Simplify, Refine, and Integrate that specifies default assumptions to be made about symbolic quantities.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Assumptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/Assumptions.html
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
fun assumptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Assumptions", arguments.toMutableList(), options)
}
