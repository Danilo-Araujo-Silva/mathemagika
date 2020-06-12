package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RightDownVectorBar
 *
 * Full name:        System`RightDownVectorBar
 *
 * Usage:            RightDownVectorBar[x, y, …] displays as x ⥕ y ⥕ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/RightDownVectorBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/RightDownVectorBar.html
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
fun rightDownVectorBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RightDownVectorBar", arguments.toMutableList(), options)
}
