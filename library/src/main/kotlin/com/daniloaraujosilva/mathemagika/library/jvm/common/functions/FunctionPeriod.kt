package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionPeriod
 *
 * Full name:        System`FunctionPeriod
 *
 *                   FunctionPeriod[f, x] gives a period p of the function f over the reals such that f(x + p)  f(x).
 *                   FunctionPeriod[f, x, dom] gives a period with x restricted to the domain dom.
 *                   FunctionPeriod[{f , f , …}, {x , x , …}, …] gives periods {p , p , …} for {x , x , …} such that f(x  + p , x  + p , …)  f(x , x , …).
 * Usage:                             1   2        1   2                         1   2           1   2                  1    1   2    2          1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FunctionPeriod
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionPeriod.html
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
fun functionPeriod(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionPeriod", arguments.toMutableList(), options)
}
