package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Colorize
 *
 * Full name:        System`Colorize
 *
 *                   Colorize[m] generates an image from an integer matrix m, using colors for positive integers and black for non-positive integers.
 * Usage:            Colorize[image] replaces intensity values in image with pseudocolor values.
 *
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorRules -> Automatic
 * Options:          ImageSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Colorize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Colorize.html
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
fun colorize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Colorize", arguments.toMutableList(), options)
}
