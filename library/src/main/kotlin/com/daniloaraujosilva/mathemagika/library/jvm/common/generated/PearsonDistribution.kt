package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PearsonDistribution
 * 
 * Full name:        System`PearsonDistribution
 * 
 *                   PearsonDistribution[a , a , b , b , b ] represents a distribution of the Pearson family with parameters a , a , b , b , and b .
 *                                        1   0   2   1   0                                                                   1   0   2   1       0
 *                   PearsonDistribution[type, a , a , b , b , b ] represents a Pearson distribution of given type. 
 * Usage:                                       1   0   2   1   0
 * 
 * Options:          None
 * 
 *                   NHoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PearsonDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/PearsonDistribution.html
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
fun pearsonDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PearsonDistribution", arguments.toMutableList(), options)
}
