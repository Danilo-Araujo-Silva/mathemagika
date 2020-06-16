package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NonCommutativeMultiply
 *
 * Full name:        System`NonCommutativeMultiply
 *
 * Usage:            a ** b ** c is a general associative, but non‐commutative, form of multiplication.
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NonCommutativeMultiply
 * Documentation:    web: http://reference.wolfram.com/language/ref/NonCommutativeMultiply.html
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
fun nonCommutativeMultiply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NonCommutativeMultiply", arguments.toMutableList(), options)
}
