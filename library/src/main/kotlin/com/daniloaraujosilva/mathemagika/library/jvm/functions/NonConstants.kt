package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NonConstants
 *
 * Full name:        System`NonConstants
 *
 * Usage:            NonConstants is an option for D which gives a list of objects to be taken to depend implicitly on the differentiation variables.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NonConstants
 * Documentation:    web: http://reference.wolfram.com/language/ref/NonConstants.html
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
fun nonConstants(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NonConstants", arguments.toMutableList(), options)
}
