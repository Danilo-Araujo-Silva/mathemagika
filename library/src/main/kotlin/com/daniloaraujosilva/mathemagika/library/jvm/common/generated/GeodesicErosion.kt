package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeodesicErosion
 * 
 * Full name:        System`GeodesicErosion
 * 
 * Usage:            GeodesicErosion[marker, mask] gives the fixed point of the geodesic erosion of the marker constrained by the mask.
 * 
 *                   CornerNeighbors -> True
 * Options:          Padding -> None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeodesicErosion
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeodesicErosion.html
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
fun geodesicErosion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeodesicErosion", arguments.toMutableList(), options)
}
