package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ConwayGroupCo3
 *
 * Full name:        System`ConwayGroupCo3
 *
 *                   ConwayGroupCo3[] represents the sporadic simple Conway group Co .
 * Usage:                                                                           3
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConwayGroupCo3
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConwayGroupCo3.html
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
fun conwayGroupCo3(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConwayGroupCo3", arguments.toMutableList(), options)
}
