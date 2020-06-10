package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeoBounds
 * 
 * Full name:        System`GeoBounds
 * 
 *                   GeoBounds[g] gives the ranges of latitudes and longitudes in the geo region g.
 *                   GeoBounds[g, δ] pads ranges of latitudes and longitudes by ± δ.
 * Usage:            GeoBounds[g, Scaled[s]] pads range of latitudes and longitudes by a scaled amount s.
 * 
 * Options:          GeoModel -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeoBounds
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoBounds.html
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
fun geoBounds(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoBounds", arguments.toMutableList(), options)
}
