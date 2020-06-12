package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AspectRatioFixed
 *
 * Full name:        System`AspectRatioFixed
 *
 * Usage:            AspectRatioFixed is an option for Cell that specifies whether graphics in the cell should be constrained to stay the same shape when they are interactively resized using the front end.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AspectRatioFixed
 * Documentation:    web: http://reference.wolfram.com/language/ref/AspectRatioFixed.html
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
fun aspectRatioFixed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AspectRatioFixed", arguments.toMutableList(), options)
}
