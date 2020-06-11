package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LogLikelihood
 *
 * Full name:        System`LogLikelihood
 *
 *                   LogLikelihood[dist, {x , x , …}] gives the log‐likelihood function for observations x , x , … from the distribution dist.
 *                                         1   2                                                          1   2
 *                   LogLikelihood[proc, {{t , x }, {t , x }, …] gives the log-likelihood function for the observations x  at time t  from the process proc.
 *                                          1   1     2   2                                                              i          i
 *                   LogLikelihood[proc, {path , path , …}] gives the log-likelihood function for the observations from path , path , … from the process proc.
 * Usage:                                     1      2                                                                      1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LogLikelihood
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogLikelihood.html
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
fun logLikelihood(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogLikelihood", arguments.toMutableList(), options)
}
