package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StylePrint
 *
 * Full name:        System`StylePrint
 *
 *                   StylePrint[expr, "style"] creates a new cell in the current notebook with the specified style, and prints expr into it.
 * Usage:            StylePrint[expr] uses the default style for the current notebook.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StylePrint
 * Documentation:    web: http://reference.wolfram.com/language/ref/StylePrint.html
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
fun stylePrint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StylePrint", arguments.toMutableList(), options)
}
