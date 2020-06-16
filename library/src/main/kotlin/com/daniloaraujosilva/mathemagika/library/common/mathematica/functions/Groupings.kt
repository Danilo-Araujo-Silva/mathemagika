package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Groupings
 *
 * Full name:        System`Groupings
 *
 *                   Groupings[n, k] gives a list of all possible groupings of 1, …, n taken k at a time.
 *                   Groupings[{a , …, a }, k] gives all possible groupings of a , …, a  taken k at a time.
 *                               1      n                                       1      n
 *                   Groupings[{{a , a , …}, {b , b , …}, …}, k] gives the combination of all possible groupings of each of the lists a , b , … taken k at a time.
 *                                1   2        1   2                                                                                   i   i
 *                   Groupings[aspec, f  k] gives all possible groupings of aspec taken k at a time with the function f applied at each level.
 *                   Groupings[aspec, {f   k , f   k , …}] gives all possible groupings in which the function f  is applied to k  elements.
 *                                      1    1   2    2                                                          i                i
 *                   Groupings[aspec, {{f   k , m }, {f   k , m }, …}] allows at most m  occurrences in a given grouping of f  applied to k  elements.
 *                                       1    1   1     2    2   2                       i                                     i             i
 * Usage:            Groupings[aspec, kspec, h] wraps the function h around each grouping generated.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Groupings
 * Documentation:    web: http://reference.wolfram.com/language/ref/Groupings.html
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
fun groupings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Groupings", arguments.toMutableList(), options)
}
