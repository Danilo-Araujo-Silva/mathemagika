package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CoordinateBoundingBoxArray
 *
 * Full name:        System`CoordinateBoundingBoxArray
 *
 *                   CoordinateBoundingBoxArray[{{x   , y   , …}, {x   , y   , …}}] generates an array of {x, y, …} coordinates with integer steps in each dimension.
 *                                                 min   min        max   max
 *                   CoordinateBoundingBoxArray[{min, max}, d] uses step d in each dimension.
 *                   CoordinateBoundingBoxArray[{min, max}, {dx, dy, …}] uses steps dx, dy, … in successive dimensions.
 *                   CoordinateBoundingBoxArray[{min, max}, Into[n]] divides into n equal steps in each dimension.
 *                   CoordinateBoundingBoxArray[{min, max}, steps, offsets] specifies offsets to use for each coordinate point.
 * Usage:            CoordinateBoundingBoxArray[{min, max}, steps, offsets, k] expands the array by k elements in every direction.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CoordinateBoundingBoxArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoordinateBoundingBoxArray.html
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
fun coordinateBoundingBoxArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoordinateBoundingBoxArray", arguments.toMutableList(), options)
}
