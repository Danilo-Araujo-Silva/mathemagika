package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Coefficient
 *
 * Full name:        System`Coefficient
 *
 *                   Coefficient[expr, form] gives the coefficient of form in the polynomial expr.
 * Usage:            Coefficient[expr, form, n] gives the coefficient of form^n in expr.
 *
 * Options:          Modulus -> 0
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Coefficient
 * Documentation:    web: http://reference.wolfram.com/language/ref/Coefficient.html
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
fun coefficient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Coefficient", arguments.toMutableList(), options)
}
