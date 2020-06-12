package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DownRightVectorBar
 *
 * Full name:        System`DownRightVectorBar
 *
 * Usage:            DownRightVectorBar[x, y, …] displays as x ⥗ y ⥗ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DownRightVectorBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/DownRightVectorBar.html
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
fun downRightVectorBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DownRightVectorBar", arguments.toMutableList(), options)
}