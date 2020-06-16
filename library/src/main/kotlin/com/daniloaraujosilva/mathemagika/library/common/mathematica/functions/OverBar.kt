package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             OverBar
 *
 * Full name:        System`OverBar
 *
 * Usage:            OverBar[expr] displays with a bar over expr.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/OverBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/OverBar.html
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
fun overBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OverBar", arguments.toMutableList(), options)
}
