package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ArcSech
 * 
 * Full name:        System`ArcSech
 * 
 *                                                                      -1
 * Usage:            ArcSech[z] gives the inverse hyperbolic secant sech  (z) of the complex number z. 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ArcSech
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcSech.html
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
fun arcSech(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcSech", arguments.toMutableList(), options)
}
