package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EulerE
 * 
 * Full name:        System`EulerE
 * 
 *                   EulerE[n] gives the Euler number E . 
 *                                                     n
 *                   EulerE[n, x] gives the Euler polynomial E (x). 
 * Usage:                                                     n
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/EulerE
 * Documentation:    web: http://reference.wolfram.com/language/ref/EulerE.html
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
fun eulerE(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EulerE", arguments.toMutableList(), options)
}
