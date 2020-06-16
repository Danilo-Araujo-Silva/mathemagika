package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Parenthesize
 *
 * Full name:        System`Parenthesize
 *
 *                   Parenthesize[ expr, fmt, prec, group] or Parenthesize[ expr, fmt, {prec, group}] will represent expr in format fmt and parenthesize it if necessary when it is an operand to an operator of the given precedence and grouping.
 *                   Parenthesize[expr, fmt, head] infers prec and group from the operator, if any, used by the symbol head in fmt.
 * Usage:            Parenthesize[expr, fmt, prec, group, side] or Parenthesize[expr, fmt, head, side] assume expr appears on the specified side of the operator.
 *
 * Options:          None
 *
 *                   HoldAllComplete
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun parenthesize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Parenthesize", arguments.toMutableList(), options)
}
