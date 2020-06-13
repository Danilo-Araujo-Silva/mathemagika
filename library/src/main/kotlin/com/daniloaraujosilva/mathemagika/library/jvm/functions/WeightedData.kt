package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WeightedData
 *
 * Full name:        System`WeightedData
 *
 *                   WeightedData[{x , x , …}, {w , w , …}] represents observations x  with weights w .
 *                                  1   2        1   2                               i               i
 *                   WeightedData[{x , x , …}, fn] represents observations x  with weighting function fn.
 * Usage:                           1   2                                   i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WeightedData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WeightedData.html
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
fun weightedData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WeightedData", arguments.toMutableList(), options)
}
