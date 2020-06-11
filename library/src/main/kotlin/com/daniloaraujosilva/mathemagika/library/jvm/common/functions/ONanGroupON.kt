package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ONanGroupON
 *
 * Full name:        System`ONanGroupON
 *
 * Usage:            ONanGroupON[] represents the sporadic simple O'Nan group O ' N.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ONanGroupON
 * Documentation:    web: http://reference.wolfram.com/language/ref/ONanGroupON.html
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
fun oNanGroupON(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ONanGroupON", arguments.toMutableList(), options)
}
