package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseHaversine
 *
 * Full name:        System`InverseHaversine
 *
 *                                                                               -1
 * Usage:            InverseHaversine[z] gives the inverse haversine function hav  (z).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/InverseHaversine
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseHaversine.html
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
fun inverseHaversine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseHaversine", arguments.toMutableList(), options)
}
