package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionExpand
 *
 * Full name:        System`FunctionExpand
 *
 *                   FunctionExpand[expr] tries to expand out special and certain other functions in expr, when possible reducing compound arguments to simpler ones.
 * Usage:            FunctionExpand[expr, assum] expands using assumptions.
 *
 * Options:          Assumptions :> $Assumptions
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FunctionExpand
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionExpand.html
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
fun functionExpand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionExpand", arguments.toMutableList(), options)
}
