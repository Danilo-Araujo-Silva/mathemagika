package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Likelihood
 *
 * Full name:        System`Likelihood
 *
 *                   Likelihood[dist, {x , x , …}] gives the likelihood function for observations x , x , … from the distribution dist.
 *                                      1   2                                                      1   2
 *                   Likelihood[proc, {{t , x }, {t , x }, …}] gives the likelihood function for the observations x  at time t  from the process proc.
 *                                       1   1     2   2                                                           i          i
 *                   Likelihood[proc, {path , path , …}] gives the likelihood function for observations from path , path , … from the process proc.
 * Usage:                                  1      2                                                              1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Likelihood
 * Documentation:    web: http://reference.wolfram.com/language/ref/Likelihood.html
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
fun likelihood(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Likelihood", arguments.toMutableList(), options)
}
