package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ConwayGroupCo1
 *
 * Full name:        System`ConwayGroupCo1
 *
 *                   ConwayGroupCo1[] represents the sporadic simple Conway group Co .
 * Usage:                                                                           1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConwayGroupCo1
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConwayGroupCo1.html
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
fun conwayGroupCo1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConwayGroupCo1", arguments.toMutableList(), options)
}
