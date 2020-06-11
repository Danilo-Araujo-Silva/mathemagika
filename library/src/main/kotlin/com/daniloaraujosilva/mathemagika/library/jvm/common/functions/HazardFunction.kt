package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HazardFunction
 *
 * Full name:        System`HazardFunction
 *
 *                   HazardFunction[dist, x] gives the hazard function for the distribution dist evaluated at x.
 *                   HazardFunction[dist, {x , x , …}] gives the multivariate hazard function for the distribution dist evaluated at {x , x , …}.
 *                                          1   2                                                                                      1   2
 * Usage:            HazardFunction[dist] gives the hazard function as a pure function.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HazardFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/HazardFunction.html
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
fun hazardFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HazardFunction", arguments.toMutableList(), options)
}
