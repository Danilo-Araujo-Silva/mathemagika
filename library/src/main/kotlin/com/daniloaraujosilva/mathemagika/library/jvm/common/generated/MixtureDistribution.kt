package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MixtureDistribution
 * 
 * Full name:        System`MixtureDistribution
 * 
 *                   MixtureDistribution[{w , …, w }, {dist , …, dist }] represents a mixture distribution whose CDF is given as a sum of the CDFs of the component distributions dist , each with weight w .
 * Usage:                                  1      n        1         n                                                                                                                i                    i
 * 
 * Options:
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MixtureDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MixtureDistribution.html
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
fun mixtureDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MixtureDistribution", arguments.toMutableList(), options)
}
