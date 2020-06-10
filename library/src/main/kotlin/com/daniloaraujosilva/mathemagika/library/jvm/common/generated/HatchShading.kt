package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HatchShading
 * 
 * Full name:        System`HatchShading
 * 
 *                   HatchShading[] is a three-dimensional graphics directive specifying that objects that follow are to be drawn with closely spaced parallel lines.
 *                   HatchShading[d] uses the density d of shading.
 *                   HatchShading[col] uses lines with the specified color col. 
 * Usage:            HatchShading[d, col] uses lines with the specified color col and density d.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/HatchShading
 * Documentation:    web: http://reference.wolfram.com/language/ref/HatchShading.html
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
fun hatchShading(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HatchShading", arguments.toMutableList(), options)
}
