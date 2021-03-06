package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeftDownVectorBar
 *
 * Full name:        System`LeftDownVectorBar
 *
 * Usage:            LeftDownVectorBar[x, y, …] displays as x ⥙ y ⥙ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftDownVectorBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftDownVectorBar.html
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
fun leftDownVectorBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftDownVectorBar", arguments.toMutableList(), options)
}
