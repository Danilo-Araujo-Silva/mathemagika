package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegionBoundary
 *
 * Full name:        System`RegionBoundary
 *
 * Usage:            RegionBoundary[reg] represents the boundary of the region reg.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RegionBoundary
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionBoundary.html
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
fun regionBoundary(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionBoundary", arguments.toMutableList(), options)
}
