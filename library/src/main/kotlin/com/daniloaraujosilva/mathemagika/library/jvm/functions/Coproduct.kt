package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Coproduct
 *
 * Full name:        System`Coproduct
 *
 * Usage:            Coproduct[x, y, …] displays as x ∐ y ∐ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Coproduct
 * Documentation:    web: http://reference.wolfram.com/language/ref/Coproduct.html
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
fun coproduct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Coproduct", arguments.toMutableList(), options)
}
