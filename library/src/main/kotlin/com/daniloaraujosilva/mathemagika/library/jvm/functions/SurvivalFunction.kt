package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SurvivalFunction
 *
 * Full name:        System`SurvivalFunction
 *
 *                   SurvivalFunction[dist, x] gives the survival function for the distribution dist evaluated at x.
 *                   SurvivalFunction[dist, {x , x , …}] gives the multivariate survival function for the distribution dist evaluated at {x , x , …}.
 *                                            1   2                                                                                        1   2
 * Usage:            SurvivalFunction[dist] gives the survival function as a pure function.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SurvivalFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/SurvivalFunction.html
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
fun survivalFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SurvivalFunction", arguments.toMutableList(), options)
}
