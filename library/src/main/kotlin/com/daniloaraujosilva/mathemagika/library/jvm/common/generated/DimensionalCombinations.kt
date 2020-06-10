package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DimensionalCombinations
 * 
 * Full name:        System`DimensionalCombinations
 * 
 *                   DimensionalCombinations[{pq , pq , …}] returns the possible combinations of the list of physical quantities pq  that are dimensionless.
 *                                              1    2                                                                             i
 *                   DimensionalCombinations[{pq , pq , …}, dim] returns the possible combinations of the list of physical quantities pq  that match the dimensions of physical quantity dim.
 * Usage:                                       1    2                                                                                  i
 * 
 *                   GeneratedParameters -> C
 * Options:          IncludeQuantities -> {}
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DimensionalCombinations
 * Documentation:    web: http://reference.wolfram.com/language/ref/DimensionalCombinations.html
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
fun dimensionalCombinations(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DimensionalCombinations", arguments.toMutableList(), options)
}
