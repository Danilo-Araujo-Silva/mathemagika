package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ManhattanDistance
 * 
 * Full name:        System`ManhattanDistance
 * 
 * Usage:            ManhattanDistance[u, v] gives the Manhattan or "city block" distance between vectors u and v.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ManhattanDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/ManhattanDistance.html
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
fun manhattanDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ManhattanDistance", arguments.toMutableList(), options)
}
