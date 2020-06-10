package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Midpoint
 * 
 * Full name:        System`Midpoint
 * 
 *                   Midpoint[{p , p }] gives the midpoint of the line segment connecting the points p  and p .
 *                              1   2                                                                 1      2
 *                   Midpoint[Line[{p , p }]] gives the midpoint of a line.
 * Usage:                            1   2
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Midpoint
 * Documentation:    web: http://reference.wolfram.com/language/ref/Midpoint.html
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
fun midpoint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Midpoint", arguments.toMutableList(), options)
}
