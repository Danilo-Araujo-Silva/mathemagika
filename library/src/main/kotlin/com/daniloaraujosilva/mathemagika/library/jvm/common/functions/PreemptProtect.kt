package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PreemptProtect
 *
 * Full name:        System`PreemptProtect
 *
 * Usage:            PreemptProtect[expr] evaluates expr, without any interruption from preemptive evaluations.
 *
 * Options:          None
 *
 *                   HoldAllComplete
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PreemptProtect
 * Documentation:    web: http://reference.wolfram.com/language/ref/PreemptProtect.html
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
fun preemptProtect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PreemptProtect", arguments.toMutableList(), options)
}
