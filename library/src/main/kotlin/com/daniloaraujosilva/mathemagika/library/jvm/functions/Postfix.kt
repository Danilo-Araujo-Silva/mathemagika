package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Postfix
 *
 * Full name:        System`Postfix
 *
 *                   Postfix[f[expr]] prints with f[expr] given in default postfix form: expr//f.
 * Usage:            Postfix[f[expr], h] prints as exprh.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Postfix
 * Documentation:    web: http://reference.wolfram.com/language/ref/Postfix.html
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
fun postfix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Postfix", arguments.toMutableList(), options)
}
