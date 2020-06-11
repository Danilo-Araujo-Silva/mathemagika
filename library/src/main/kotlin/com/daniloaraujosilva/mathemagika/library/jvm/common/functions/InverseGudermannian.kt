package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseGudermannian
 *
 * Full name:        System`InverseGudermannian
 *
 *                                                                                    -1
 * Usage:            InverseGudermannian[z] gives the inverse Gudermannian function gd  (z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InverseGudermannian
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseGudermannian.html
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
fun inverseGudermannian(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseGudermannian", arguments.toMutableList(), options)
}
