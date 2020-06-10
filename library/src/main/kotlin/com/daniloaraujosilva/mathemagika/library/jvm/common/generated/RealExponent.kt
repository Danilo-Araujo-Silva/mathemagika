package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RealExponent
 * 
 * Full name:        System`RealExponent
 * 
 *                   RealExponent[x] gives log  ( x ).
 *                                            10
 *                   RealExponent[x, b] gives log ( x ).
 * Usage:                                        b
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RealExponent
 * Documentation:    web: http://reference.wolfram.com/language/ref/RealExponent.html
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
fun realExponent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RealExponent", arguments.toMutableList(), options)
}
