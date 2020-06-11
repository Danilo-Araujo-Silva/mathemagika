package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringForm
 *
 * Full name:        System`StringForm
 *
 *                   StringForm["controlstring", expr , …] prints as the text of the controlstring, with the printed forms of the expr  embedded.
 * Usage:                                            1                                                                                i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringForm.html
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
fun stringForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringForm", arguments.toMutableList(), options)
}
