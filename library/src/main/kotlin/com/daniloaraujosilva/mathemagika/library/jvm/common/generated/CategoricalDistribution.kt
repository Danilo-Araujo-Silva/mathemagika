package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CategoricalDistribution
 * 
 * Full name:        System`CategoricalDistribution
 * 
 *                   CategoricalDistribution[{c , c , …}] generates a uniform categorical distribution over classes c , c , etc.
 *                                             1   2                                                                 1   2
 *                   CategoricalDistribution[{c , c , …}, {w , w , …}] generates a categorical distribution over classes c  with weights w .
 *                                             1   2        1   2                                                         i               i
 *                   CategoricalDistribution[{{a , a , …}, {b , b , …}, …}] generates a uniform multivariate categorical distribution over domain {a , a , …} × {b , b , …} × ….
 *                                              1   2        1   2                                                                                  1   2         1   2
 * Usage:            CategoricalDistribution[domain, weights] uses the array weights to define probabilities over each element of the domain.
 * 
 * Options:          OrderingFunction -> LessEqual
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/CategoricalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/CategoricalDistribution.html
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
fun categoricalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CategoricalDistribution", arguments.toMutableList(), options)
}
