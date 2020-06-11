package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CoordinateBoundsArray
 *
 * Full name:        System`CoordinateBoundsArray
 *
 *                   CoordinateBoundsArray[{{x   , x   }, {y   , y   }, …}] generates an array of {x, y, …} coordinates with integer steps in each dimension.
 *                                            min   max     min   max
 *                   CoordinateBoundsArray[{xrange, yrange, …}, d] uses step d in each dimension.
 *                   CoordinateBoundsArray[{xrange, yrange, …}, {dx, dy, …}] uses steps dx, dy, … in successive dimensions.
 *                   CoordinateBoundsArray[{xrange, yrange, …}, Into[n]] divides into n equal steps in each dimension.
 *                   CoordinateBoundsArray[{xrange, yrange, …}, steps, offsets] specifies offsets to use for each coordinate point.
 * Usage:            CoordinateBoundsArray[{xrange, yrange, …}, steps, offsets, k] expands the array by k elements in every direction.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CoordinateBoundsArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoordinateBoundsArray.html
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
fun coordinateBoundsArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoordinateBoundsArray", arguments.toMutableList(), options)
}
