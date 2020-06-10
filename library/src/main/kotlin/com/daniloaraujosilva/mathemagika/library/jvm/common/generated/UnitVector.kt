package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             UnitVector
 * 
 * Full name:        System`UnitVector
 * 
 *                                                                                th
 *                   UnitVector[k] gives the two-dimensional unit vector in the k   direction.
 *                                                                                 th
 * Usage:            UnitVector[n, k] gives the n-dimensional unit vector in the k   direction.
 * 
 * Options:          WorkingPrecision -> Infinity
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/UnitVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitVector.html
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
fun unitVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitVector", arguments.toMutableList(), options)
}
