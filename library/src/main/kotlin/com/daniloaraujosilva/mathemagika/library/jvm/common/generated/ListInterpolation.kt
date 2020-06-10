package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ListInterpolation
 * 
 * Full name:        System`ListInterpolation
 * 
 *                   ListInterpolation[array] constructs an InterpolatingFunction object that represents an approximate function that interpolates the array of values given. 
 *                   ListInterpolation[array, {{x   , x   }, {y   , y   }, …}] specifies the domain of the grid from which the values in array are assumed to come. 
 * Usage:                                        min   max     min   max
 * 
 *                   InterpolationOrder -> 3
 *                   Method -> Automatic
 * Options:          PeriodicInterpolation -> False
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ListInterpolation
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListInterpolation.html
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
fun listInterpolation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListInterpolation", arguments.toMutableList(), options)
}
