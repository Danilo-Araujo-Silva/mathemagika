package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StripWrapperBoxes
 *
 * Full name:        System`StripWrapperBoxes
 *
 * Usage:            StripWrapperBoxes is an option to TagBox that controls how boxes are stripped upon evaluation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StripWrapperBoxes
 * Documentation:    web: http://reference.wolfram.com/language/ref/StripWrapperBoxes.html
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
fun stripWrapperBoxes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StripWrapperBoxes", arguments.toMutableList(), options)
}
