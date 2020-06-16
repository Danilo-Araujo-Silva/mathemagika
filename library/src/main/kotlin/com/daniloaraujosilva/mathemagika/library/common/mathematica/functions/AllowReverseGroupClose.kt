package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AllowReverseGroupClose
 *
 * Full name:        System`AllowReverseGroupClose
 *
 * Usage:            AllowReverseGroupClose is an option for Cell that specifies whether a cell group can be reverse closed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AllowReverseGroupClose
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllowReverseGroupClose.html
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
fun allowReverseGroupClose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllowReverseGroupClose", arguments.toMutableList(), options)
}
