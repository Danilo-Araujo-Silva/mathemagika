package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoArea
 *
 * Full name:        System`GeoArea
 *
 * Usage:            GeoArea[g] gives the area of the geo region g.
 *
 *                   GeoModel -> Automatic
 *                   Method -> Automatic
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoArea
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoArea.html
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
fun geoArea(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoArea", arguments.toMutableList(), options)
}
