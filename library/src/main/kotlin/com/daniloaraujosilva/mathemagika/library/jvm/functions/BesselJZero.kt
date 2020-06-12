package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BesselJZero
 *
 * Full name:        System`BesselJZero
 *
 *                                                      th
 *                   BesselJZero[n, k] represents the k   zero of the Bessel function J (x).
 *                                                                                      n
 *                                                          th
 *                   BesselJZero[n, k, x ] represents the k   zero greater than x .
 * Usage:                               0                                         0
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BesselJZero
 * Documentation:    web: http://reference.wolfram.com/language/ref/BesselJZero.html
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
fun besselJZero(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BesselJZero", arguments.toMutableList(), options)
}
