package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TriangleMeasurement
 *
 * Full name:        System`TriangleMeasurement
 *
 * Usage:            TriangleMeasurement[tri, type] gives the specified type of measurement for the triangle tri.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TriangleMeasurement
 * Documentation:    web: http://reference.wolfram.com/language/ref/TriangleMeasurement.html
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
fun triangleMeasurement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TriangleMeasurement", arguments.toMutableList(), options)
}
