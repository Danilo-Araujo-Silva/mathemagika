package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PreserveColor
 *
 * Full name:        System`PreserveColor
 *
 * Usage:            PreserveColor is an option for ImageRestyle and related functions that specifies whether to preserve colors in the original image.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PreserveColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/PreserveColor.html
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
fun preserveColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PreserveColor", arguments.toMutableList(), options)
}
