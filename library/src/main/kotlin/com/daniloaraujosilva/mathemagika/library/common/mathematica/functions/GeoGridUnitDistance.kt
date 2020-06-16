package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoGridUnitDistance
 *
 * Full name:        System`GeoGridUnitDistance
 *
 * Usage:            GeoGridUnitDistance[proj, loc, α] gives the actual geo distance corresponding to a unit distance on the geo grid obtained with projection proj, evaluated in the limit of small displacement from location loc in direction α.
 *
 *                   GeoModel -> Automatic
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoGridUnitDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoGridUnitDistance.html
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
fun geoGridUnitDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoGridUnitDistance", arguments.toMutableList(), options)
}
