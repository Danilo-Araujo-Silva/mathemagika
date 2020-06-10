package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FromContinuedFraction
 * 
 * Full name:        System`FromContinuedFraction
 * 
 * Usage:            FromContinuedFraction[list] reconstructs a number from the list of its continued fraction terms. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FromContinuedFraction
 * Documentation:    web: http://reference.wolfram.com/language/ref/FromContinuedFraction.html
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
fun fromContinuedFraction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FromContinuedFraction", arguments.toMutableList(), options)
}
