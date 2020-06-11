package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HeavisidePi
 *
 * Full name:        System`HeavisidePi
 *
 *                                                                                               1                   1
 *                   HeavisidePi[x] represents the box distribution Π(x), equal to 1 for  x  < - and 0 for  x  > -.
 *                                                                                               2                   2
 *                                                                                                                                   1
 *                   HeavisidePi[x , x , …] represents the multidimensional box distribution Π(x , x , …) which is 1 if all  x   < -.
 * Usage:                         1   2                                                         1   2                          i     2
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Orderless
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HeavisidePi
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeavisidePi.html
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
fun heavisidePi(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeavisidePi", arguments.toMutableList(), options)
}
