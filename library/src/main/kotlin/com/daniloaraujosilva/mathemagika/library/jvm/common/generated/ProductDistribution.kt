package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ProductDistribution
 * 
 * Full name:        System`ProductDistribution
 * 
 *                   ProductDistribution[dist , dist , …] represents the joint distribution with independent component distributions dist , dist , ….
 * Usage:                                    1      2                                                                                    1      2
 * 
 * Options:
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ProductDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProductDistribution.html
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
fun productDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProductDistribution", arguments.toMutableList(), options)
}
