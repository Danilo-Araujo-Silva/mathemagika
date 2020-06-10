package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ArcTanh
 * 
 * Full name:        System`ArcTanh
 * 
 *                                                                       -1
 * Usage:            ArcTanh[z] gives the inverse hyperbolic tangent tanh  (z) of the complex number z. 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ArcTanh
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcTanh.html
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
fun arcTanh(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcTanh", arguments.toMutableList(), options)
}
