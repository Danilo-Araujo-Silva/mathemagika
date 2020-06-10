package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HurwitzZeta
 * 
 * Full name:        System`HurwitzZeta
 * 
 * Usage:            HurwitzZeta[s, a] gives the Hurwitz zeta function ζ(s, a).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/HurwitzZeta
 * Documentation:    web: http://reference.wolfram.com/language/ref/HurwitzZeta.html
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
fun hurwitzZeta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HurwitzZeta", arguments.toMutableList(), options)
}
