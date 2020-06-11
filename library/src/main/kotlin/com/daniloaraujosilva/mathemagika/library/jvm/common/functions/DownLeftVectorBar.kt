package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DownLeftVectorBar
 *
 * Full name:        System`DownLeftVectorBar
 *
 * Usage:            DownLeftVectorBar[x, y, …] displays as x ⥖ y ⥖ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownLeftVectorBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownLeftVectorBar.html
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
fun downLeftVectorBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownLeftVectorBar", arguments.toMutableList(), options)
}
