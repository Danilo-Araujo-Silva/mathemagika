package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Underoverscript
 *
 * Full name:        System`Underoverscript
 *
 *                                                                         z
 *                   Underoverscript[x, y, z] is an object that formats as x.
 * Usage:                                                                  y
 *
 * Options:          None
 *
 * Attributes:       NHoldRest
 *
 *                   local: paclet:ref/Underoverscript
 * Documentation:    web: http://reference.wolfram.com/language/ref/Underoverscript.html
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
fun underoverscript(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Underoverscript", arguments.toMutableList(), options)
}
