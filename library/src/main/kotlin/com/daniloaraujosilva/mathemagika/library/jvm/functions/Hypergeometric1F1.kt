package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Hypergeometric1F1
 *
 * Full name:        System`Hypergeometric1F1
 *
 *                   Hypergeometric1F1[a, b, z] is the Kummer confluent hypergeometric function    F  (a ; b ; z).
 * Usage:                                                                                        1    1
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Hypergeometric1F1
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hypergeometric1F1.html
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
fun hypergeometric1F1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hypergeometric1F1", arguments.toMutableList(), options)
}
