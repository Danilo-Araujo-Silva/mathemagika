package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TriangleConstruct
 *
 * Full name:        System`TriangleConstruct
 *
 * Usage:            TriangleConstruct[tri, type] gives the specified type of construct for the triangle tri.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TriangleConstruct
 * Documentation:    web: http://reference.wolfram.com/language/ref/TriangleConstruct.html
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
fun triangleConstruct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TriangleConstruct", arguments.toMutableList(), options)
}
