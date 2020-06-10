package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PerfectNumber
 * 
 * Full name:        System`PerfectNumber
 * 
 *                                                th
 * Usage:            PerfectNumber[n] gives the n   perfect number.
 * 
 * Options:          None
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PerfectNumber
 * Documentation:    web: http://reference.wolfram.com/language/ref/PerfectNumber.html
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
fun perfectNumber(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PerfectNumber", arguments.toMutableList(), options)
}
