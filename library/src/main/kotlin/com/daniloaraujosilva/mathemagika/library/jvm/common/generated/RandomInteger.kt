package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RandomInteger
 * 
 * Full name:        System`RandomInteger
 * 
 *                   RandomInteger[{i   , i   }] gives a pseudorandom integer in the range {i   , i   }. 
 *                                   min   max                                               min   max
 *                   RandomInteger[i   ] gives a pseudorandom integer in the range {0, …, i   }. 
 *                                  max                                                    max
 *                   RandomInteger[] pseudorandomly gives 0 or 1. 
 *                   RandomInteger[range, n] gives a list of n pseudorandom integers. 
 *                   RandomInteger[range, {n , n , …}] gives an n ×n ×… array of pseudorandom integers. 
 * Usage:                                   1   2                1  2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RandomInteger
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomInteger.html
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
fun randomInteger(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomInteger", arguments.toMutableList(), options)
}
