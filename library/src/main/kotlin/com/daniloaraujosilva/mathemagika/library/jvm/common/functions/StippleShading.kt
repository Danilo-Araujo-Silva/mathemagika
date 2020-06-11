package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StippleShading
 *
 * Full name:        System`StippleShading
 *
 *                   StippleShading[] is a three-dimensional graphics directive specifying that objects that follow are to be drawn using small dots.
 *                   StippleShading[d] uses the density d of shading.
 *                   StippleShading[col] uses dots with the specified color col.
 * Usage:            StippleShading[d, col] uses dots of color col with the density d of shading.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StippleShading
 * Documentation:    web: http://reference.wolfram.com/language/ref/StippleShading.html
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
fun stippleShading(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StippleShading", arguments.toMutableList(), options)
}
