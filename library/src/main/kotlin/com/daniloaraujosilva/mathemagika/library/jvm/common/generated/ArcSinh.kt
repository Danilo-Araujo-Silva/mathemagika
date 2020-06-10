package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ArcSinh
 * 
 * Full name:        System`ArcSinh
 * 
 *                                                                    -1
 * Usage:            ArcSinh[z] gives the inverse hyperbolic sine sinh  (z) of the complex number z. 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ArcSinh
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcSinh.html
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
fun arcSinh(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcSinh", arguments.toMutableList(), options)
}
