package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RandomSample
 *
 * Full name:        System`RandomSample
 *
 *                   RandomSample[{e , e , …}, n] gives a pseudorandom sample of n of the e .
 *                                  1   2                                                  i
 *                   RandomSample[{w , w , …}  {e , e , …}, n] gives a pseudorandom sample of n of the e  chosen using weights w .
 *                                  1   2         1   2                                                  i                       i
 *                   RandomSample[{e , e , …}] gives a pseudorandom permutation of the e .
 * Usage:                           1   2                                               i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RandomSample
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomSample.html
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
fun randomSample(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomSample", arguments.toMutableList(), options)
}
