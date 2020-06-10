package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NumeratorDenominator
 * 
 * Full name:        System`NumeratorDenominator
 * 
 * Usage:            NumeratorDenominator[expr] gives the list {Numerator[expr], Denominator[expr]} of expr.
 * 
 *                   Modulus -> 0
 * Options:          Trig -> False
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/NumeratorDenominator
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumeratorDenominator.html
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
fun numeratorDenominator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumeratorDenominator", arguments.toMutableList(), options)
}
