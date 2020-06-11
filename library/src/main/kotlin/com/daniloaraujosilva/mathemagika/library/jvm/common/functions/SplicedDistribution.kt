package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SplicedDistribution
 *
 * Full name:        System`SplicedDistribution
 *
 *                   SplicedDistribution[{w , w , …, w }, {c , c , …, c }, {dist   dist , …, dist }] represents the distribution obtained by splicing the distributions dist , dist , … truncated on the intervals {c , c }, {c , c }, … with weights w , w , … .
 * Usage:                                  1   2      n     0   1      n        1,     2         n                                                                          1      2                                 0   1     1   2                   1   2
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SplicedDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SplicedDistribution.html
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
fun splicedDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SplicedDistribution", arguments.toMutableList(), options)
}
