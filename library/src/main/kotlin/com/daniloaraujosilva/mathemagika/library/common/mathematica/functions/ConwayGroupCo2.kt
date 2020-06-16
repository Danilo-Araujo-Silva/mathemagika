package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ConwayGroupCo2
 *
 * Full name:        System`ConwayGroupCo2
 *
 *                   ConwayGroupCo2[] represents the sporadic simple Conway group Co .
 * Usage:                                                                           2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ConwayGroupCo2
 * Documentation:    web: http://reference.wolfram.com/language/ref/ConwayGroupCo2.html
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
fun conwayGroupCo2(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ConwayGroupCo2", arguments.toMutableList(), options)
}
