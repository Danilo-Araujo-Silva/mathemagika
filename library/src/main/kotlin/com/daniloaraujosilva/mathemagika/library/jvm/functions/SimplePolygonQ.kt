package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SimplePolygonQ
 *
 * Full name:        System`SimplePolygonQ
 *
 * Usage:            SimplePolygonQ[poly] gives True if the polygon poly is simple and False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SimplePolygonQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SimplePolygonQ.html
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
fun simplePolygonQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SimplePolygonQ", arguments.toMutableList(), options)
}
