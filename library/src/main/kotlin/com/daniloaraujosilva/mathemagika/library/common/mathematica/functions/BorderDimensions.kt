package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BorderDimensions
 *
 * Full name:        System`BorderDimensions
 *
 *                   BorderDimensions[image] gives the pixel width of uniform borders of image in the form {{left, right}, {bottom, top}}.
 * Usage:            BorderDimensions[image, t] finds borders whose pixels vary by an amount less than t.
 *
 * Options:          Background -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BorderDimensions
 * Documentation:    web: http://reference.wolfram.com/language/ref/BorderDimensions.html
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
fun borderDimensions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BorderDimensions", arguments.toMutableList(), options)
}
