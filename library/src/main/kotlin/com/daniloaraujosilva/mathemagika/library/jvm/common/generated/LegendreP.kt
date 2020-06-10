package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             LegendreP
 * 
 * Full name:        System`LegendreP
 * 
 *                   LegendreP[n, x] gives the Legendre polynomial P (x). 
 *                                                                  n
 *                                                                                m
 *                   LegendreP[n, m, x] gives the associated Legendre polynomial P (x). 
 * Usage:                                                                         n
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/LegendreP
 * Documentation:    web: http://reference.wolfram.com/language/ref/LegendreP.html
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
fun legendreP(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LegendreP", arguments.toMutableList(), options)
}
