package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ComplexExpand
 *
 * Full name:        System`ComplexExpand
 *
 *                   ComplexExpand[expr] expands expr assuming that all variables are real.
 *                   ComplexExpand[expr, {x , x , …}] expands expr assuming that variables matching any of the x  are complex.
 * Usage:                                  1   2                                                                i
 *
 * Options:          TargetFunctions -> {Re, Im, Abs, Arg, Conjugate, Sign}
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ComplexExpand
 * Documentation:    web: http://reference.wolfram.com/language/ref/ComplexExpand.html
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
fun complexExpand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ComplexExpand", arguments.toMutableList(), options)
}
