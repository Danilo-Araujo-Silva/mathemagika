package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CoordinateTransformData
 *
 * Full name:        System`CoordinateTransformData
 *
 *                   CoordinateTransformData[t, property] gives the value of the specified property for the coordinate transformation t.
 *                   CoordinateTransformData[t, property, {x , x , …, x }] gives the value of the property evaluated at the point {x , x , …, x }.
 * Usage:                                                   1   2      n                                                            1   2      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CoordinateTransformData
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoordinateTransformData.html
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
fun coordinateTransformData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoordinateTransformData", arguments.toMutableList(), options)
}
