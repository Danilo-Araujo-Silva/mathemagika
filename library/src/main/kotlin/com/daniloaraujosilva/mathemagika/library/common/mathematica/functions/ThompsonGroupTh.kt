package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ThompsonGroupTh
 *
 * Full name:        System`ThompsonGroupTh
 *
 * Usage:            ThompsonGroupTh[] represents the sporadic simple Thompson group Th.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ThompsonGroupTh
 * Documentation:    web: http://reference.wolfram.com/language/ref/ThompsonGroupTh.html
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
fun thompsonGroupTh(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ThompsonGroupTh", arguments.toMutableList(), options)
}
