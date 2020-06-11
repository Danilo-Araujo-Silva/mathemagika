package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Conditioned
 *
 * Full name:        System`Conditioned
 *
 * Usage:            Conditioned[expr, cond] or expr  cond represents expr conditioned by the predicate cond.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Conditioned
 * Documentation:    web: http://reference.wolfram.com/language/ref/Conditioned.html
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
fun conditioned(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Conditioned", arguments.toMutableList(), options)
}
