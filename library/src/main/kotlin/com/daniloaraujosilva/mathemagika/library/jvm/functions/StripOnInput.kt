package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StripOnInput
 *
 * Full name:        System`StripOnInput
 *
 * Usage:            StripOnInput is an option for certain boxes that determines whether the box should be stripped on evaluation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StripOnInput
 * Documentation:    web: http://reference.wolfram.com/language/ref/StripOnInput.html
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
fun stripOnInput(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StripOnInput", arguments.toMutableList(), options)
}
