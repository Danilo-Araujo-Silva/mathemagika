package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DoubleBracketingBar
 *
 * Full name:        System`DoubleBracketingBar
 *
 * Usage:            DoubleBracketingBar[x, y, …] displays as  x, y, … .
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DoubleBracketingBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/DoubleBracketingBar.html
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
fun doubleBracketingBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DoubleBracketingBar", arguments.toMutableList(), options)
}
