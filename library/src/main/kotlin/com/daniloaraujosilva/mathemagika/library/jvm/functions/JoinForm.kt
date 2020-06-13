package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             JoinForm
 *
 * Full name:        System`JoinForm
 *
 * Usage:            JoinForm[type] is a graphics directive that specifies what type of joins should be used to connect segments of lines, tubes, edges, and related primitives.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JoinForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/JoinForm.html
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
fun joinForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JoinForm", arguments.toMutableList(), options)
}
