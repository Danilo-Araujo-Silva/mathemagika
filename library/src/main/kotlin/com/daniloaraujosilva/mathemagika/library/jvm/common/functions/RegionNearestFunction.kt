package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegionNearestFunction
 *
 * Full name:        System`RegionNearestFunction
 *
 * Usage:            RegionNearestFunction[reg, …]  represents a function whose values give the nearest point in the region reg.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionNearestFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionNearestFunction.html
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
fun regionNearestFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionNearestFunction", arguments.toMutableList(), options)
}
