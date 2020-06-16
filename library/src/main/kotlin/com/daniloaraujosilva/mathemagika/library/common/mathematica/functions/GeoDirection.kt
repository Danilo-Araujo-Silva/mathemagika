package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeoDirection
 *
 * Full name:        System`GeoDirection
 *
 *                   GeoDirection[{lat , lon }, {lat , lon }] gives the azimuthal direction from one latitude-longitude position on the Earth to another.
 *                                    1     1       2     2
 *                   GeoDirection[loc , loc ] gives the azimuthal direction between locations specified by position objects or geographic entities.
 * Usage:                            1     2
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoDirection
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoDirection.html
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
fun geoDirection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoDirection", arguments.toMutableList(), options)
}
