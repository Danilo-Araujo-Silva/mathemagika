package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MakeBoxes
 *
 * Full name:        System`MakeBoxes
 *
 *                   MakeBoxes[expr, form] is the low‐level function used in Wolfram System sessions to convert expressions into boxes.
 * Usage:            MakeBoxes[expr] is the function to convert expr to StandardForm boxes.
 *
 * Options:          None
 *
 * Attributes:       HoldAllComplete
 *
 *                   local: paclet:ref/MakeBoxes
 * Documentation:    web: http://reference.wolfram.com/language/ref/MakeBoxes.html
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
fun makeBoxes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MakeBoxes", arguments.toMutableList(), options)
}
