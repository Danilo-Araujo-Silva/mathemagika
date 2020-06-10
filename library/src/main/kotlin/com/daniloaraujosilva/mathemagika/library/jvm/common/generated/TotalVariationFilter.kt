package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TotalVariationFilter
 * 
 * Full name:        System`TotalVariationFilter
 * 
 *                   TotalVariationFilter[data] iteratively reduces noise while preserving rapid transitions in data.
 * Usage:            TotalVariationFilter[data, param] assumes a regularization parameter value param.
 * 
 *                   MaxIterations -> 30
 * Options:          Method -> Gaussian
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TotalVariationFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/TotalVariationFilter.html
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
fun totalVariationFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TotalVariationFilter", arguments.toMutableList(), options)
}
