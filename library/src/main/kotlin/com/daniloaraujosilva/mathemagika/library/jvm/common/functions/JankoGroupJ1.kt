package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             JankoGroupJ1
 *
 * Full name:        System`JankoGroupJ1
 *
 *                   JankoGroupJ1[] represents the sporadic simple Janko group J .
 * Usage:                                                                       1
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JankoGroupJ1
 * Documentation:    web: http://reference.wolfram.com/language/ref/JankoGroupJ1.html
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
fun jankoGroupJ1(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JankoGroupJ1", arguments.toMutableList(), options)
}
