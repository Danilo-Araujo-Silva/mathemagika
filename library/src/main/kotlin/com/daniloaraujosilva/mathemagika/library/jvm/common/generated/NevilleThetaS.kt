package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NevilleThetaS
 * 
 * Full name:        System`NevilleThetaS
 * 
 *                   NevilleThetaS[z, m] gives the Neville theta function ϑ  (z  m). 
 * Usage:                                                                  s
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NevilleThetaS
 * Documentation:    web: http://reference.wolfram.com/language/ref/NevilleThetaS.html
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
fun nevilleThetaS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NevilleThetaS", arguments.toMutableList(), options)
}
