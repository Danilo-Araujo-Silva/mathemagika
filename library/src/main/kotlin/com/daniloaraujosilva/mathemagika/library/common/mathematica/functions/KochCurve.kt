package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KochCurve
 *
 * Full name:        System`KochCurve
 *
 *                                                                           th
 *                   KochCurve[n] gives the line segments representing the n  -step Koch curve.
 *                   KochCurve[n, {θ , θ , …}] takes a series of steps of unit length at successive relative angles θ .
 *                                  1   2                                                                            i
 *                   KochCurve[n, {{r , θ }, {r , θ }, …}] takes successive steps of lengths proportional to r .
 * Usage:                            1   1     2   2                                                          i
 *
 * Options:          DataRange -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KochCurve
 * Documentation:    web: http://reference.wolfram.com/language/ref/KochCurve.html
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
fun kochCurve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KochCurve", arguments.toMutableList(), options)
}
