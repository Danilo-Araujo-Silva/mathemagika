package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CanonicalizePolygon
 *
 * Full name:        System`CanonicalizePolygon
 *
 *                   CanonicalizePolygon[poly] gives a canonical representation of the polygon poly with shared coordinates and with inner and outer boundaries.
 * Usage:            CanonicalizePolygon[poly, "filter"] gives a canonical representation of poly with the specified filter.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CanonicalizePolygon
 * Documentation:    web: http://reference.wolfram.com/language/ref/CanonicalizePolygon.html
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
fun canonicalizePolygon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CanonicalizePolygon", arguments.toMutableList(), options)
}
