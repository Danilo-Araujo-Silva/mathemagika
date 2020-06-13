package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FromCoefficientRules
 *
 * Full name:        System`FromCoefficientRules
 *
 *                   FromCoefficientRules[list, {x , x , …}] constructs a polynomial from a list of rules for exponent vectors and coefficients.
 * Usage:                                         1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FromCoefficientRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromCoefficientRules.html
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
fun fromCoefficientRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromCoefficientRules", arguments.toMutableList(), options)
}
