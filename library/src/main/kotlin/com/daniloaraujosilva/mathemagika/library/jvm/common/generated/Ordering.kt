package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Ordering
 * 
 * Full name:        System`Ordering
 * 
 *                   Ordering[list] gives the positions in list at which each successive element of Sort[list] appears. 
 *                   Ordering[list, n] gives the positions in list at which the first n elements of Sort[list] appear. 
 *                   Ordering[list, -n] gives the positions of the last n elements of Sort[list]. 
 * Usage:            Ordering[list, n, p] gives positions in list of elements of Sort[list, p]. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Ordering
 * Documentation:    web: http://reference.wolfram.com/language/ref/Ordering.html
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
fun ordering(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Ordering", arguments.toMutableList(), options)
}
