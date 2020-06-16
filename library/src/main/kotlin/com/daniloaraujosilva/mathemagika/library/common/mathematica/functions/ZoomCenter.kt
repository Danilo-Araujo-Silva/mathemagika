package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ZoomCenter
 *
 * Full name:        System`ZoomCenter
 *
 * Usage:            ZoomCenter is an option for DynamicImage that specifies the position of a zoom window within an image.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ZoomCenter
 * Documentation:    web: http://reference.wolfram.com/language/ref/ZoomCenter.html
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
fun zoomCenter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ZoomCenter", arguments.toMutableList(), options)
}
