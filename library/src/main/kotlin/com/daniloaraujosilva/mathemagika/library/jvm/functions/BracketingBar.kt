package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BracketingBar
 *
 * Full name:        System`BracketingBar
 *
 * Usage:            BracketingBar[x, y, …] displays as  x, y, … .
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/BracketingBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/BracketingBar.html
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
fun bracketingBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BracketingBar", arguments.toMutableList(), options)
}
