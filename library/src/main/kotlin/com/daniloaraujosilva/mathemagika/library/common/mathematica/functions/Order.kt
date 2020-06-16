package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Order
 *
 * Full name:        System`Order
 *
 *                   Order[expr , expr ] gives 1 if expr  is before expr  in canonical order, and -1 if expr  is after expr  in canonical order. It gives 0 if expr  is identical to expr .
 * Usage:                      1      2                 1               2                                   1              2                                       1                     2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Order
 * Documentation:    web: http://reference.wolfram.com/language/ref/Order.html
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
fun order(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Order", arguments.toMutableList(), options)
}
