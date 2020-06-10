package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EmpiricalDistribution
 * 
 * Full name:        System`EmpiricalDistribution
 * 
 *                   EmpiricalDistribution[{x , x , …}] represents an empirical distribution based on the data values x .
 *                                           1   2                                                                     i
 *                   EmpiricalDistribution[{{x , y , …}, {x , y , …}, …}] represents a multivariate empirical distribution based on the data values {x , y , …}.
 *                                            1   1        2   2                                                                                      i   i
 *                   EmpiricalDistribution[{w , w , …}  {d , d , …}] represents an empirical distribution where data values d  occur with weights w .
 * Usage:                                    1   2         1   2                                                              i                     i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/EmpiricalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/EmpiricalDistribution.html
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
fun empiricalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EmpiricalDistribution", arguments.toMutableList(), options)
}
