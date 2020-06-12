package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BartlettHannWindow
 *
 * Full name:        System`BartlettHannWindow
 *
 * Usage:            BartlettHannWindow[x] represents a Bartlett–Hann window function of x.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BartlettHannWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/BartlettHannWindow.html
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
fun bartlettHannWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BartlettHannWindow", arguments.toMutableList(), options)
}
