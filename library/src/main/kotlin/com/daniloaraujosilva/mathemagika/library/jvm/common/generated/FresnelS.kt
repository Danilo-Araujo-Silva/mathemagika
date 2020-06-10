package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FresnelS
 * 
 * Full name:        System`FresnelS
 * 
 * Usage:            FresnelS[z] gives the Fresnel integral S(z). 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FresnelS
 * Documentation:    web: http://reference.wolfram.com/language/ref/FresnelS.html
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
fun fresnelS(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FresnelS", arguments.toMutableList(), options)
}
