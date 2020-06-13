package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeodesicOpening
 *
 * Full name:        System`GeodesicOpening
 *
 *                   GeodesicOpening[image, ker] gives the geodesic opening of image with respect to the structuring element ker.
 *                   GeodesicOpening[image, r] gives the geodesic opening with respect to a range r square.
 * Usage:            GeodesicOpening[data, …] applies geodesic opening to an array of data.
 *
 * Options:          None
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeodesicOpening
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeodesicOpening.html
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
fun geodesicOpening(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeodesicOpening", arguments.toMutableList(), options)
}
