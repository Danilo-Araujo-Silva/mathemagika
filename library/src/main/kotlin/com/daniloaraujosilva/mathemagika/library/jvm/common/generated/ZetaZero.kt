package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ZetaZero
 * 
 * Full name:        System`ZetaZero
 * 
 *                                                th
 *                   ZetaZero[k] represents the k   zero of the Riemann zeta function on the critical line.
 *                                                   th
 * Usage:            ZetaZero[k, t] represents the k   zero with imaginary part greater than t.
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NHoldFirst
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ZetaZero
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZetaZero.html
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
fun zetaZero(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZetaZero", arguments.toMutableList(), options)
}
