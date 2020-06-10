package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AlgebraicNumberDenominator
 * 
 * Full name:        System`AlgebraicNumberDenominator
 * 
 * Usage:            AlgebraicNumberDenominator[a] gives the smallest positive integer n such that n a is an algebraic integer.
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AlgebraicNumberDenominator
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlgebraicNumberDenominator.html
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
fun algebraicNumberDenominator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlgebraicNumberDenominator", arguments.toMutableList(), options)
}
