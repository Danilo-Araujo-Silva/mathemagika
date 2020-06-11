package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeoStylingImageFunction
 *
 * Full name:        System`GeoStylingImageFunction
 *
 * Usage:            GeoStylingImageFunction is an option for specifying an image effect to apply to a geo style.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeoStylingImageFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeoStylingImageFunction.html
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
fun geoStylingImageFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeoStylingImageFunction", arguments.toMutableList(), options)
}
