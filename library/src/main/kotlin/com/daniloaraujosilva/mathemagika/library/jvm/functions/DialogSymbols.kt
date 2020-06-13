package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DialogSymbols
 *
 * Full name:        System`DialogSymbols
 *
 * Usage:            DialogSymbols is an option for Dialog that gives a list of symbols whose values should be localized in the dialog.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DialogSymbols
 * Documentation:    web: http://reference.wolfram.com/language/ref/DialogSymbols.html
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
fun dialogSymbols(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DialogSymbols", arguments.toMutableList(), options)
}
