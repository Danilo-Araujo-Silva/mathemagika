package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NevilleThetaN
 * 
 * Full name:        System`NevilleThetaN
 * 
 *                   NevilleThetaN[z, m] gives the Neville theta function ϑ  (z  m). 
 * Usage:                                                                  n
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NevilleThetaN
 * Documentation:    web: http://reference.wolfram.com/language/ref/NevilleThetaN.html
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
fun nevilleThetaN(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NevilleThetaN", arguments.toMutableList(), options)
}
