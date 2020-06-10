package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KelvinKei
 * 
 * Full name:        System`KelvinKei
 * 
 *                   KelvinKei[z] gives the Kelvin function kei(z).
 *                   KelvinKei[n, z] gives the Kelvin function kei (z). 
 * Usage:                                                         n
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/KelvinKei
 * Documentation:    web: http://reference.wolfram.com/language/ref/KelvinKei.html
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
fun kelvinKei(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KelvinKei", arguments.toMutableList(), options)
}
