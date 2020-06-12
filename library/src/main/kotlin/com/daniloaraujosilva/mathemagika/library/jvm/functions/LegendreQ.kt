package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LegendreQ
 *
 * Full name:        System`LegendreQ
 *
 *                   LegendreQ[n, z] gives the Legendre function of the second kind Q (z).
 *                                                                                   n
 *                                                                                                 m
 *                   LegendreQ[n, m, z] gives the associated Legendre function of the second kind Q (z).
 * Usage:                                                                                          n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LegendreQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/LegendreQ.html
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
fun legendreQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LegendreQ", arguments.toMutableList(), options)
}
