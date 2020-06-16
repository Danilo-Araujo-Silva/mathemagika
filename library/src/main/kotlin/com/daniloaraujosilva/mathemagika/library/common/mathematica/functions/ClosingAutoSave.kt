package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ClosingAutoSave
 *
 * Full name:        System`ClosingAutoSave
 *
 * Usage:            ClosingAutoSave is an option for notebooks that specifies whether a notebook is automatically saved when it is closed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ClosingAutoSave
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClosingAutoSave.html
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
fun closingAutoSave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClosingAutoSave", arguments.toMutableList(), options)
}
