package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DialogProlog
 *
 * Full name:        System`DialogProlog
 *
 * Usage:            DialogProlog is an option for Dialog that can give an expression to evaluate before the dialog starts.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DialogProlog
 * Documentation:    web: http://reference.wolfram.com/language/ref/DialogProlog.html
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
fun dialogProlog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DialogProlog", arguments.toMutableList(), options)
}
