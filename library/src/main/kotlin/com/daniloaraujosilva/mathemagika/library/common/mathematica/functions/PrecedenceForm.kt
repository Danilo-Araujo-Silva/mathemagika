package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PrecedenceForm
 *
 * Full name:        System`PrecedenceForm
 *
 * Usage:            PrecedenceForm[expr, prec] prints with expr parenthesized as it would be if it contained an operator with precedence prec.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrecedenceForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrecedenceForm.html
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
fun precedenceForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrecedenceForm", arguments.toMutableList(), options)
}
