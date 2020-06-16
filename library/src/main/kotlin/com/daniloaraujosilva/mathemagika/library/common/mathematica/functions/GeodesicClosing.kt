package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GeodesicClosing
 *
 * Full name:        System`GeodesicClosing
 *
 *                   GeodesicClosing[image, ker] gives the geodesic closing of image with respect to the structuring element ker.
 *                   GeodesicClosing[image, r] gives the geodesic closing with respect to a range r square.
 * Usage:            GeodesicClosing[data, …] applies geodesic closing to an array of data.
 *
 * Options:          None
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeodesicClosing
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeodesicClosing.html
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
fun geodesicClosing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeodesicClosing", arguments.toMutableList(), options)
}
