package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BellY
 *
 * Full name:        System`BellY
 *
 *                   BellY[n, k, {x , …, x         }] gives the partial Bell polynomial Y    (x , …, x         ).
 *                                 1      n - k + 1                                      n, k  1      n - k + 1
 *                   BellY[n, k, m] gives the generalized partial Bell polynomial of a matrix m.
 * Usage:            BellY[m] gives the generalized Bell polynomial of a matrix m.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BellY
 * Documentation:    web: http://reference.wolfram.com/language/ref/BellY.html
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
fun bellY(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BellY", arguments.toMutableList(), options)
}
