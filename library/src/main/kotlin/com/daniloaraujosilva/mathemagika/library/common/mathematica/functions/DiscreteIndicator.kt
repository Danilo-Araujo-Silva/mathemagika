package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DiscreteIndicator
 *
 * Full name:        System`DiscreteIndicator
 *
 *                   DiscreteIndicator[x, x , {u , u , …}] yields the discrete indicator function, equal to 1 if x = x  and, otherwise, to 0 if x = u  for some i.
 * Usage:                                  1    1   2                                                                 1                              i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiscreteIndicator
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteIndicator.html
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
fun discreteIndicator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteIndicator", arguments.toMutableList(), options)
}
