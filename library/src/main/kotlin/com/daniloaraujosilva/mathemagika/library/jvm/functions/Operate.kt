package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Operate
 *
 * Full name:        System`Operate
 *
 *                   Operate[p, f[x, y]] gives p[f][x, y].
 * Usage:            Operate[p, expr, n] applies p at level n in the head of expr.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Operate
 * Documentation:    web: http://reference.wolfram.com/language/ref/Operate.html
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
fun operate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Operate", arguments.toMutableList(), options)
}
