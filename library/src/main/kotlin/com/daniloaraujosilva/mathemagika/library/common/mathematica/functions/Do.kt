package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Do
 *
 * Full name:        System`Do
 *
 *                   Do[expr, n] evaluates expr n times.
 *                   Do[expr, {i, i   }] evaluates expr with the variable i successively taking on the values 1 through i    (in steps of 1).
 *                                 max                                                                                   max
 *                   Do[expr, {i, i   , i   }] starts with i = i   .
 *                                 min   max                    min
 *                   Do[expr, {i, i   , i   , di}] uses steps di.
 *                                 min   max
 *                   Do[expr, {i, {i , i , …}}] uses the successive values i , i , ….
 *                                  1   2                                   1   2
 *                   Do[expr, {i, i   , i   }, {j, j   , j   }, …] evaluates expr looping over different values of j etc. for each i.
 * Usage:                          min   max        min   max
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Do
 * Documentation:    web: http://reference.wolfram.com/language/ref/Do.html
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
fun `do`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Do", arguments.toMutableList(), options)
}
