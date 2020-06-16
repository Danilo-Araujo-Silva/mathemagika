package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoAntipode
 *
 * Full name:        System`GeoAntipode
 *
 *                   GeoAntipode[loc] gives the antipodal position of location loc.
 * Usage:            GeoAntipode[g] gives the antipodal primitive of the geo primitive g.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoAntipode
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoAntipode.html
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
fun geoAntipode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoAntipode", arguments.toMutableList(), options)
}
