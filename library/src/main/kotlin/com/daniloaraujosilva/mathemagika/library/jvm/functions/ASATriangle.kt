package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ASATriangle
 *
 * Full name:        System`ASATriangle
 *
 * Usage:            ASATriangle[α, c, β] returns a filled triangle with angles α and β and side length c, and c is adjacent to both angles.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ASATriangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/ASATriangle.html
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
fun aSATriangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ASATriangle", arguments.toMutableList(), options)
}
