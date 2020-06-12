package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SurfaceData
 *
 * Full name:        System`SurfaceData
 *
 *                   SurfaceData[entity, property] gives the value of the specified property for the surface entity.
 *                   SurfaceData[{entity , entity , …}, property] gives a list of property values for the specified surface entities.
 *                                      1        2
 * Usage:            SurfaceData[entity, property, annotation] gives the specified annotation associated with the given property.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SurfaceData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SurfaceData.html
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
fun surfaceData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SurfaceData", arguments.toMutableList(), options)
}
