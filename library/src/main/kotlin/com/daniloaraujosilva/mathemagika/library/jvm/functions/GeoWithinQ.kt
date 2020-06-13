package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeoWithinQ
 *
 * Full name:        System`GeoWithinQ
 *
 *                   GeoWithinQ[reg, loc] returns True if the location loc is contained within the region reg, and False otherwise.
 * Usage:            GeoWithinQ[reg] represents an operator form of GeoWithinQ that can be applied to a location.
 *
 *                   FullyContained -> False
 * Options:          TimeConstraint -> 20
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoWithinQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoWithinQ.html
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
fun geoWithinQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoWithinQ", arguments.toMutableList(), options)
}
