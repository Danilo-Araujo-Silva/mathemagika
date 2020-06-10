package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Latitude
 * 
 * Full name:        System`Latitude
 * 
 *                   Latitude[pos] gives the latitude in degrees of a geographic position specified by pos.
 * Usage:            Latitude[pos, datum] gives the latitude referring to the specified geodetic datum.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Latitude
 * Documentation:    web: http://reference.wolfram.com/language/ref/Latitude.html
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
fun latitude(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Latitude", arguments.toMutableList(), options)
}
