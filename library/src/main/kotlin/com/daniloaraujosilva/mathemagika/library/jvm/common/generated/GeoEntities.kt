package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GeoEntities
 * 
 * Full name:        System`GeoEntities
 * 
 * Usage:            GeoEntities[reg, enttype] gives a list of the geographic entities of type enttype contained in the extended region reg.
 * 
 *                   FullyContained -> False
 * Options:          TimeConstraint -> 20
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GeoEntities
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoEntities.html
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
fun geoEntities(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoEntities", arguments.toMutableList(), options)
}
