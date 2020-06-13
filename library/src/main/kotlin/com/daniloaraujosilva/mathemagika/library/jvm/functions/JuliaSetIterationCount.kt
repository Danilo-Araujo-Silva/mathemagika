package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             JuliaSetIterationCount
 *
 * Full name:        System`JuliaSetIterationCount
 *
 *                   JuliaSetIterationCount[f, z, p] returns the number of iterations, beginning with the complex number z  p, of the function f(z) needed to determine whether p is in the Julia set of f.
 *                                                                                                                                                   2                                                                  2
 *                   JuliaSetIterationCount[c, p] returns the number of iterations, beginning with the complex number z  p, of the function f(z)  z  + c needed to determine whether p is in the Julia set of f(z)  z  + c.
 *                   JuliaSetIterationCount[f, z, {p , p , …}] returns a list of the number of iterations required to determine whether each member of {p , p , …} is in the Julia set of f.
 *                                                  1   2                                                                                                1   2
 *                                                                                                                                                                                             2
 *                   JuliaSetIterationCount[c, {p , p , …}] returns a list of the number of iterations required to determine whether each member of {p , p , …} is in the Julia set of f(z)  z  + c.
 * Usage:                                        1   2                                                                                                1   2
 *
 *                   MaxIterations -> 1000
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JuliaSetIterationCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/JuliaSetIterationCount.html
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
fun juliaSetIterationCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JuliaSetIterationCount", arguments.toMutableList(), options)
}
