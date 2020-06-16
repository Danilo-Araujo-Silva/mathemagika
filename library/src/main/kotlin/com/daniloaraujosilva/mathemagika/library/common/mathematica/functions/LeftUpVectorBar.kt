package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LeftUpVectorBar
 *
 * Full name:        System`LeftUpVectorBar
 *
 * Usage:            LeftUpVectorBar[x, y, …] displays as x ⥘ y ⥘ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LeftUpVectorBar
 * Documentation:    web: http://reference.wolfram.com/language/ref/LeftUpVectorBar.html
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
fun leftUpVectorBar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LeftUpVectorBar", arguments.toMutableList(), options)
}
