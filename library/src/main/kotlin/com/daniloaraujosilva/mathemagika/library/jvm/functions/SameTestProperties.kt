package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SameTestProperties
 *
 * Full name:        System`SameTestProperties
 *
 * Usage:            SameTestProperties is an option for set operations on entity classes whose setting gives the properties that are used to decide whether two given entities are the same.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SameTestProperties
 * Documentation:    web: http://reference.wolfram.com/language/ref/SameTestProperties.html
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
fun sameTestProperties(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SameTestProperties", arguments.toMutableList(), options)
}
