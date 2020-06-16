package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Nearest
 *
 * Full name:        System`Nearest
 *
 *                   Nearest[{elem , elem , …}, x] gives the list of elem  to which x is nearest.
 *                                1      2                               i
 *                   Nearest[{elem   v , elem   v , …}, x] gives the v  corresponding to the elem  to which x is nearest.
 *                                1    1      2    2                    i                          i
 *                   Nearest[{elem , elem , …}  {v , v , …}, x] gives the same result.
 *                                1      2         1   2
 *                   Nearest[{elem , elem , …}  prop, x] gives the property prop for the elem  to which x is nearest.
 *                                1      2                                                    i
 *                   Nearest[data, {x , x , …}] effectively gives {Nearest[data, x ], Nearest[data, x ], …}.
 *                                   1   2                                        1                  2
 *                   Nearest[data, x, n] gives the n nearest elem  to x.
 *                                                               i
 *                   Nearest[data, x, {n, r}] gives the n or fewer nearest elem  to x that are within radius r of x.
 *                                                                             i
 * Usage:            Nearest[data] generates a NearestFunction[…] that can be applied repeatedly to different x.
 *
 *                   DistanceFunction -> Automatic
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Nearest
 * Documentation:    web: http://reference.wolfram.com/language/ref/Nearest.html
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
fun nearest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Nearest", arguments.toMutableList(), options)
}
