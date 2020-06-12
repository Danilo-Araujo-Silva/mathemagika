package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TukeyWindow
 *
 * Full name:        System`TukeyWindow
 *
 *                   TukeyWindow[x] represents a Tukey window function of x.
 * Usage:            TukeyWindow[x, α] uses the parameter α.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TukeyWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/TukeyWindow.html
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
fun tukeyWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TukeyWindow", arguments.toMutableList(), options)
}
