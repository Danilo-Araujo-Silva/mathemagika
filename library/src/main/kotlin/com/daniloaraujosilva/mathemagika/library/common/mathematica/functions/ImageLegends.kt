package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageLegends
 *
 * Full name:        System`ImageLegends
 *
 * Usage:            ImageLegends is an option for image highlighting that specifies what legends to use.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageLegends
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageLegends.html
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
fun imageLegends(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageLegends", arguments.toMutableList(), options)
}
