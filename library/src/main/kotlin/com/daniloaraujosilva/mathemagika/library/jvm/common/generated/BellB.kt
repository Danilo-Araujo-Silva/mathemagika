package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             BellB
 * 
 * Full name:        System`BellB
 * 
 *                   BellB[n] gives the Bell number B . 
 *                                                   n
 *                   BellB[n, x] gives the Bell polynomial B (x). 
 * Usage:                                                   n
 * 
 * Options:          None
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/BellB
 * Documentation:    web: http://reference.wolfram.com/language/ref/BellB.html
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
fun bellB(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BellB", arguments.toMutableList(), options)
}
