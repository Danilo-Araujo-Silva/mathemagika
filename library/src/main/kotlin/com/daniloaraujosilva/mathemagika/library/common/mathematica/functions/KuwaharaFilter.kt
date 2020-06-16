package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KuwaharaFilter
 *
 * Full name:        System`KuwaharaFilter
 *
 * Usage:            KuwaharaFilter[data, r] computes for each element p in data the variance of the values in the four (r + 1) × (r + 1) squares that have p as a corner, and replaces p with the mean of the values of the square with least variance.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KuwaharaFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/KuwaharaFilter.html
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
fun kuwaharaFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KuwaharaFilter", arguments.toMutableList(), options)
}
