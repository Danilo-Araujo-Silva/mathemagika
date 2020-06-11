package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BlackmanNuttallWindow
 *
 * Full name:        System`BlackmanNuttallWindow
 *
 * Usage:            BlackmanNuttallWindow[x] represents a Blackman–Nuttall window function of x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BlackmanNuttallWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlackmanNuttallWindow.html
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
fun blackmanNuttallWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlackmanNuttallWindow", arguments.toMutableList(), options)
}
