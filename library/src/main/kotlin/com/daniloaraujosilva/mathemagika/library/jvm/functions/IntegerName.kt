package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IntegerName
 *
 * Full name:        System`IntegerName
 *
 *                   IntegerName[n] gives a string containing the full English name of the integer n.
 * Usage:            IntegerName[n, qualifier] gives a string conforming to the given qualifications.
 *
 * Options:          Language -> English
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IntegerName
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntegerName.html
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
fun integerName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntegerName", arguments.toMutableList(), options)
}
