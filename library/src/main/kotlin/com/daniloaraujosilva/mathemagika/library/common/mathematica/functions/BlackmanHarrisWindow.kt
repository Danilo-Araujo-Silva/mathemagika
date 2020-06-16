package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BlackmanHarrisWindow
 *
 * Full name:        System`BlackmanHarrisWindow
 *
 * Usage:            BlackmanHarrisWindow[x] represents a Blackman–Harris window function of x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BlackmanHarrisWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlackmanHarrisWindow.html
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
fun blackmanHarrisWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlackmanHarrisWindow", arguments.toMutableList(), options)
}
