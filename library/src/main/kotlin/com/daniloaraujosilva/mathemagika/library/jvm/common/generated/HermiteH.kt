package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HermiteH
 * 
 * Full name:        System`HermiteH
 * 
 *                   HermiteH[n, x] gives the Hermite polynomial H (x). 
 * Usage:                                                         n
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/HermiteH
 * Documentation:    web: http://reference.wolfram.com/language/ref/HermiteH.html
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
fun hermiteH(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HermiteH", arguments.toMutableList(), options)
}
