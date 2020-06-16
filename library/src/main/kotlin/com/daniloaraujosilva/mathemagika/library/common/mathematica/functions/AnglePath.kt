package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AnglePath
 *
 * Full name:        System`AnglePath
 *
 *                   AnglePath[{θ , θ , θ , …}] gives the list of 2D coordinates corresponding to a path that starts at {0, 0}, then takes a series of steps of unit length at successive relative angles θ .
 *                               1   2   3                                                                                                                                                                 i
 *                   AnglePath[{{r , θ }, {r , θ }, {r , θ }, …}] takes successive steps of lengths r .
 *                                1   1     2   2     3   3                                          i
 *                   AnglePath[θ , {step , step , …}] starts at angle θ  with respect to the x axis.
 *                              0       1      2                       0
 *                   AnglePath[{x, y}, {step , step , …}] starts at the point {x, y} with initial angle 0 with respect to the x axis.
 *                                          1      2
 *                   AnglePath[{{x, y}, θ }, {step , step , …}] starts at {x, y} with initial angle θ  with respect to the x axis.
 *                                       0        1      2                                           0
 *                   AnglePath[{{x, y}, {dx, dy}}, {step , step , …}] takes the first step to go from {x, y} to {x + dx, y + dy}.
 *                                                      1      2
 * Usage:            AnglePath[init, steps, form] returns at each step the data of the form specified by form.
 *
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AnglePath
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnglePath.html
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
fun anglePath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnglePath", arguments.toMutableList(), options)
}
