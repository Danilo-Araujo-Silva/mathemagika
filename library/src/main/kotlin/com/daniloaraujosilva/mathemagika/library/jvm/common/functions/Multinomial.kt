package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Multinomial
 *
 * Full name:        System`Multinomial
 *
 *                   Multinomial[n , n , …] gives the multinomial coefficient (n  + n  + …) !/(n  ! n  ! …).
 * Usage:                         1   2                                         1    2          1    2
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Orderless
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Multinomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/Multinomial.html
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
fun multinomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Multinomial", arguments.toMutableList(), options)
}
