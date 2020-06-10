package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KeyIntersection
 * 
 * Full name:        System`KeyIntersection
 * 
 *                   KeyIntersection[{assoc , assoc , …}] generates a list of associations in which only elements whose keys appear in all the assoc  are retained.
 * Usage:                                  1       2                                                                                                i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/KeyIntersection
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyIntersection.html
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
fun keyIntersection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyIntersection", arguments.toMutableList(), options)
}
