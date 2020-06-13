package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RegionMemberFunction
 *
 * Full name:        System`RegionMemberFunction
 *
 * Usage:            RegionMemberFunction[reg, …]  represents a function whose values give whether a point is in a region reg or not.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionMemberFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionMemberFunction.html
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
fun regionMemberFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionMemberFunction", arguments.toMutableList(), options)
}
