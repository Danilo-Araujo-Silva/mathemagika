package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionDomain
 *
 * Full name:        System`FunctionDomain
 *
 *                   FunctionDomain[f, x] finds the largest domain of definition of the real function f of the variable x.
 *                   FunctionDomain[f, x, dom] considers f to be a function with arguments and values in the domain dom.
 *                   FunctionDomain[funs, vars, dom] finds the largest domain of definition of the mapping funs of the variables vars.
 * Usage:            FunctionDomain[{funs, cons}, vars, dom] finds the domain of funs with the values of vars restricted by constraints cons.
 *
 *                   GeneratedParameters -> C
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FunctionDomain
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionDomain.html
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
fun functionDomain(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionDomain", arguments.toMutableList(), options)
}
