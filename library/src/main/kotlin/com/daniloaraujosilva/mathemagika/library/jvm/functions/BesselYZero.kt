package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BesselYZero
 *
 * Full name:        System`BesselYZero
 *
 *                                                      th
 *                   BesselYZero[n, k] represents the k   zero of the Bessel function of the second kind Y (x).
 *                                                                                                         n
 *                                                          th
 *                   BesselYZero[n, k, x ] represents the k   zero greater than x .
 * Usage:                               0                                         0
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BesselYZero
 * Documentation:    web: http://reference.wolfram.com/language/ref/BesselYZero.html
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
fun besselYZero(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BesselYZero", arguments.toMutableList(), options)
}
