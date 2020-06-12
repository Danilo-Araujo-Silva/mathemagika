package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BooleanMinimize
 *
 * Full name:        System`BooleanMinimize
 *
 *                   BooleanMinimize[expr] finds a minimal-length disjunctive normal form representation of expr.
 *                   BooleanMinimize[expr, form] finds a minimal-length representation for expr in the specified form.
 * Usage:            BooleanMinimize[expr, form, cond] finds a minimal-length expression in the specified form that is equivalent to expr when cond is true.
 *
 *                   MaxIterations -> Infinity
 * Options:          Method -> Automatic
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BooleanMinimize
 * Documentation:    web: http://reference.wolfram.com/language/ref/BooleanMinimize.html
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
fun booleanMinimize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BooleanMinimize", arguments.toMutableList(), options)
}
