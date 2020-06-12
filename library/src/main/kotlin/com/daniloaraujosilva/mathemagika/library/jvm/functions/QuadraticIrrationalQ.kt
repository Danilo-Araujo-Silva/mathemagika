package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             QuadraticIrrationalQ
 *
 * Full name:        System`QuadraticIrrationalQ
 *
 * Usage:            QuadraticIrrationalQ[x] gives True if x is a quadratic irrational and False otherwise.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/QuadraticIrrationalQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuadraticIrrationalQ.html
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
fun quadraticIrrationalQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuadraticIrrationalQ", arguments.toMutableList(), options)
}
