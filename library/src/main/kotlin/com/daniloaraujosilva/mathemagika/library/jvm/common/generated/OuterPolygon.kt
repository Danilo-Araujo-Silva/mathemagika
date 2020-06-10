package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             OuterPolygon
 * 
 * Full name:        System`OuterPolygon
 * 
 * Usage:            OuterPolygon[poly] gives the outer polygon of the polygon poly.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/OuterPolygon
 * Documentation:    web: http://reference.wolfram.com/language/ref/OuterPolygon.html
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
fun outerPolygon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OuterPolygon", arguments.toMutableList(), options)
}
