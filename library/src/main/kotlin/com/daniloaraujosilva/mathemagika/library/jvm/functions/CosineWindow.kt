package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CosineWindow
 *
 * Full name:        System`CosineWindow
 *
 *                   CosineWindow[x] represents a cosine window function of x.
 * Usage:            CosineWindow[x, α] uses the exponent α.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CosineWindow
 * Documentation:    web: http://reference.wolfram.com/language/ref/CosineWindow.html
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
fun cosineWindow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CosineWindow", arguments.toMutableList(), options)
}
