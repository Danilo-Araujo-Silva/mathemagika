package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoGridUnitArea
 *
 * Full name:        System`GeoGridUnitArea
 *
 * Usage:            GeoGridUnitArea[proj, loc] gives the actual geo area corresponding to a unit area on the geo grid obtained with projection proj, evaluated in the limit of small geo regions around location loc.
 *
 *                   GeoModel -> Automatic
 * Options:          UnitSystem :> $UnitSystem
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoGridUnitArea
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoGridUnitArea.html
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
fun geoGridUnitArea(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoGridUnitArea", arguments.toMutableList(), options)
}
