package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AlgebraicRules
 *
 * Full name:        System`AlgebraicRules
 *
 * Usage:            System`AlgebraicRules
 *
 *                   InverseFunctions -> Automatic
 *                   MakeRules -> True
 *                   Method -> 1
 *                   Mode -> Rational
 *                   Sort -> False
 *                   VerifySolutions -> False
 * Options:          WorkingPrecision -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AlgebraicRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlgebraicRules.html
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
fun algebraicRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlgebraicRules", arguments.toMutableList(), options)
}
