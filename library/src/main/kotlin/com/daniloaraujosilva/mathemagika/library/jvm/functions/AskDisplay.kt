package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AskDisplay
 *
 * Full name:        System`AskDisplay
 *
 * Usage:            AskDisplay[expr] is a construct for use inside AskFunction that displays the result of evaluating expr in the context of the AskFunction.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AskDisplay
 * Documentation:    web: http://reference.wolfram.com/language/ref/AskDisplay.html
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
fun askDisplay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AskDisplay", arguments.toMutableList(), options)
}
