package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TriangleCenter
 *
 * Full name:        System`TriangleCenter
 *
 *                   TriangleCenter[tri, type] gives the specified type of center for the triangle tri.
 * Usage:            TriangleCenter[tri] gives the centroid of the triangle.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TriangleCenter
 * Documentation:    web: http://reference.wolfram.com/language/ref/TriangleCenter.html
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
fun triangleCenter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TriangleCenter", arguments.toMutableList(), options)
}
