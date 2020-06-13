package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StartOfLine
 *
 * Full name:        System`StartOfLine
 *
 * Usage:            StartOfLine represents the start of a line in a string for purposes of matching in StringExpression.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StartOfLine
 * Documentation:    web: http://reference.wolfram.com/language/ref/StartOfLine.html
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
fun startOfLine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StartOfLine", arguments.toMutableList(), options)
}
