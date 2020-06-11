package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionRange
 *
 * Full name:        System`FunctionRange
 *
 *                   FunctionRange[f, x, y] finds the range of the real function f of the variable x returning the result in terms of y.
 *                   FunctionRange[f, x, y, dom] considers f to be a function with arguments and values in the domain dom.
 *                   FunctionRange[funs, xvars, yvars, dom] finds the range of the mapping funs of the variables xvars returning the result in terms of yvars.
 * Usage:            FunctionRange[{funs, cons}, xvars, yvars, dom] finds the range of the mapping funs with the values of xvars restricted by constraints cons.
 *
 *                   GeneratedParameters -> C
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FunctionRange
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionRange.html
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
fun functionRange(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionRange", arguments.toMutableList(), options)
}
