package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InnerPolygon
 *
 * Full name:        System`InnerPolygon
 *
 * Usage:            InnerPolygon[poly] gives the inner polygon of the polygon poly.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InnerPolygon
 * Documentation:    web: http://reference.wolfram.com/language/ref/InnerPolygon.html
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
fun innerPolygon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InnerPolygon", arguments.toMutableList(), options)
}
