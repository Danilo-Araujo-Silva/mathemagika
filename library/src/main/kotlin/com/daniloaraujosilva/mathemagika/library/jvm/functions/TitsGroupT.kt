package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TitsGroupT
 *
 * Full name:        System`TitsGroupT
 *
 * Usage:            TitsGroupT[] represents the simple Tits group T.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TitsGroupT
 * Documentation:    web: http://reference.wolfram.com/language/ref/TitsGroupT.html
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
fun titsGroupT(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TitsGroupT", arguments.toMutableList(), options)
}
