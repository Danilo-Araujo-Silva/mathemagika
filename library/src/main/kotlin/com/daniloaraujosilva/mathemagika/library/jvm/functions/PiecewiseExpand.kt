package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PiecewiseExpand
 *
 * Full name:        System`PiecewiseExpand
 *
 *                   PiecewiseExpand[expr] expands nested piecewise functions in expr to give a single piecewise function.
 *                   PiecewiseExpand[expr, assum] expands piecewise functions using assumptions.
 * Usage:            PiecewiseExpand[expr, assum, dom] does the expansion over the domain dom.
 *
 *                   Assumptions :> $Assumptions
 *                   Method -> Automatic
 * Options:          TimeConstraint -> 30
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PiecewiseExpand
 * Documentation:    web: http://reference.wolfram.com/language/ref/PiecewiseExpand.html
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
fun piecewiseExpand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PiecewiseExpand", arguments.toMutableList(), options)
}
