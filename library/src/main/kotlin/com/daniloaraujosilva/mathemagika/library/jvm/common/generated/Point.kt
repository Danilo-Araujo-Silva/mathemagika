package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Point
 * 
 * Full name:        System`Point
 * 
 *                   Point[p] is a graphics and geometry primitive that represents a point at p. 
 *                   Point[{p , p , …}] represents a collection of points. 
 * Usage:                    1   2
 * 
 *                   VertexColors -> None
 * Options:          VertexNormals -> None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Point
 * Documentation:    web: http://reference.wolfram.com/language/ref/Point.html
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
fun point(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Point", arguments.toMutableList(), options)
}
