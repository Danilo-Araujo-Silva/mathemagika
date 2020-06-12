package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoIdentify
 *
 * Full name:        System`GeoIdentify
 *
 *                   GeoIdentify[enttype] identifies the geographic entities of the type enttype in which the current geo location is contained.
 *                   GeoIdentify[enttype, loc] identifies the entities in which the location loc is contained.
 * Usage:            GeoIdentify[] identifies the entities of any type in which the current geo location is contained.
 *
 *                   FullyContained -> False
 * Options:          TimeConstraint -> 20
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoIdentify
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoIdentify.html
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
fun geoIdentify(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoIdentify", arguments.toMutableList(), options)
}
