package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ProductLog
 *
 * Full name:        System`ProductLog
 *
 *                                                                               w
 *                   ProductLog[z] gives the principal solution for w in z  w e .
 *                                                th
 * Usage:            ProductLog[k, z] gives the k   solution.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ProductLog
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProductLog.html
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
fun productLog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProductLog", arguments.toMutableList(), options)
}
