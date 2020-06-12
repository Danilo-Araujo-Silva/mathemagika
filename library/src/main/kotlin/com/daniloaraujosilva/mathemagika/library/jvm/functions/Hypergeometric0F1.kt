package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Hypergeometric0F1
 *
 * Full name:        System`Hypergeometric0F1
 *
 *                   Hypergeometric0F1[a, z] is the confluent hypergeometric function    F  (; a ; z).
 * Usage:                                                                              0    1
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Hypergeometric0F1
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hypergeometric0F1.html
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
fun hypergeometric0F1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hypergeometric0F1", arguments.toMutableList(), options)
}
