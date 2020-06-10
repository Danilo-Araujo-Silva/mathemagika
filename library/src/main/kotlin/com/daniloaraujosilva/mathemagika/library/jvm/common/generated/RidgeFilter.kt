package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RidgeFilter
 * 
 * Full name:        System`RidgeFilter
 * 
 *                   RidgeFilter[data] computes a measure for the presence of a ridge at every position of data.
 * Usage:            RidgeFilter[data, σ] uses the specified ridge scale σ.
 * 
 *                   InterpolationOrder -> Automatic
 * Options:          Padding -> Fixed
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RidgeFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/RidgeFilter.html
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
fun ridgeFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RidgeFilter", arguments.toMutableList(), options)
}
