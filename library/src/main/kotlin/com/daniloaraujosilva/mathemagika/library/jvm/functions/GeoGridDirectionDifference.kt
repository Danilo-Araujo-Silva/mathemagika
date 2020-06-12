package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoGridDirectionDifference
 *
 * Full name:        System`GeoGridDirectionDifference
 *
 *                   GeoGridDirectionDifference[proj, loc, β] gives the difference between the angle from north to direction β on the geo grid obtained with projection proj and the actual angle from north to direction β at location loc.
 * Usage:            GeoGridDirectionDifference[proj, loc, α  β] gives the difference between projected and unprojected angles from direction α to direction β.
 *
 * Options:          GeoModel -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoGridDirectionDifference
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoGridDirectionDifference.html
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
fun geoGridDirectionDifference(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoGridDirectionDifference", arguments.toMutableList(), options)
}
