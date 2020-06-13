package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GeodesicDilation
 *
 * Full name:        System`GeodesicDilation
 *
 * Usage:            GeodesicDilation[marker, mask] gives the fixed point of the geodesic dilation of the marker constrained by the mask.
 *
 *                   CornerNeighbors -> True
 * Options:          Padding -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeodesicDilation
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeodesicDilation.html
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
fun geodesicDilation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeodesicDilation", arguments.toMutableList(), options)
}
