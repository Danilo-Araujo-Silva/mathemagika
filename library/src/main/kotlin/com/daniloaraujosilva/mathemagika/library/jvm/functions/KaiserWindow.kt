package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             KaiserWindow
 *
 * Full name:        System`KaiserWindow
 *
 *                   KaiserWindow[x] represents a Kaiser window function of x.
 * Usage:            KaiserWindow[x, α] uses the parameter α.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KaiserWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/KaiserWindow.html
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
fun kaiserWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KaiserWindow", arguments.toMutableList(), options)
}
