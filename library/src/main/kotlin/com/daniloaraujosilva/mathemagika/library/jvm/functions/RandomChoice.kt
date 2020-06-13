package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RandomChoice
 *
 * Full name:        System`RandomChoice
 *
 *                   RandomChoice[{e , e , …}] gives a pseudorandom choice of one of the e .
 *                                  1   2                                                 i
 *                   RandomChoice[list, n] gives a list of n pseudorandom choices.
 *                   RandomChoice[list, {n , n , …}] gives an n ×n ×… array of pseudorandom choices.
 *                                        1   2                1  2
 *                   RandomChoice[{w , w , …}  {e , e , …}] gives a pseudorandom choice weighted by the w .
 *                                  1   2         1   2                                                   i
 *                   RandomChoice[wlist  elist, n] gives a list of n weighted choices.
 *                   RandomChoice[wlist  elist, {n , n , …}] gives an n ×n ×… array of weighted choices.
 * Usage:                                          1   2                1  2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RandomChoice
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomChoice.html
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
fun randomChoice(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomChoice", arguments.toMutableList(), options)
}
