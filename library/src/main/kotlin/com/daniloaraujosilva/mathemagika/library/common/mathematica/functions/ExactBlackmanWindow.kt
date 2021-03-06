package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ExactBlackmanWindow
 *
 * Full name:        System`ExactBlackmanWindow
 *
 * Usage:            ExactBlackmanWindow[x] represents an exact Blackman window function of x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ExactBlackmanWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExactBlackmanWindow.html
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
fun exactBlackmanWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExactBlackmanWindow", arguments.toMutableList(), options)
}
