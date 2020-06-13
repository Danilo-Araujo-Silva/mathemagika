package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RightUpVectorBar
 *
 * Full name:        System`RightUpVectorBar
 *
 * Usage:            RightUpVectorBar[x, y, …] displays as x ⥔ y ⥔ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightUpVectorBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightUpVectorBar.html
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
fun rightUpVectorBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightUpVectorBar", arguments.toMutableList(), options)
}
