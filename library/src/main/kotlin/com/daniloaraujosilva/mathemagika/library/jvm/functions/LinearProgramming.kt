package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LinearProgramming
 *
 * Full name:        System`LinearProgramming
 *
 *                   LinearProgramming[c, m, b] finds a vector x that minimizes the quantity c . x subject to the constraints m . x ≥ b and x ≥ 0.
 *                   LinearProgramming[c, m, {{b , s }, {b , s }, …}] finds a vector x that minimizes c . x subject to x ≥ 0 and linear constraints specified by the matrix m and the pairs {b , s }. For each row m  of m, the corresponding constraint is m  . x ≥ b  if s  == 1, or m  . x == b  if s  == 0, or m  . x ≤ b  if s  == -1.
 *                                              1   1     2   2                                                                                                                               i   i                 i                                        i        i     i           i         i     i           i        i     i
 *                   LinearProgramming[c, m, b, l] minimizes c . x subject to the constraints specified by m and b and x ≥ l.
 *                   LinearProgramming[c, m, b, {l , l , …}] minimizes c . x subject to the constraints specified by m and b and x  ≥ l .
 *                                                1   2                                                                           i    i
 *                   LinearProgramming[c, m, b, {{l , u }, {l , u }, …}] minimizes c . x subject to the constraints specified by m and b and l  ≤ x  ≤ u .
 *                                                 1   1     2   2                                                                            i    i    i
 *                   LinearProgramming[c, m, b, lu, dom] takes the elements of x to be in the domain dom, either Reals or Integers.
 *                   LinearProgramming[c, m, b, lu, {dom , dom , …}] takes x  to be in the domain dom .
 * Usage:                                               1     2             i                        i
 *
 *                   Method -> Automatic
 * Options:          Tolerance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinearProgramming
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearProgramming.html
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
fun linearProgramming(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearProgramming", arguments.toMutableList(), options)
}
