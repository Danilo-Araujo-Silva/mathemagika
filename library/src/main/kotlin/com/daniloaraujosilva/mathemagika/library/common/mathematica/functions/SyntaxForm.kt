package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SyntaxForm
 *
 * Full name:        System`SyntaxForm
 *
 * Usage:            SyntaxForm is an option for InterpretationBox and TagBox objects that specifies the precedence level to use when the InterpretationBox or TagBox is considered as an operator.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SyntaxForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/SyntaxForm.html
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
fun syntaxForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SyntaxForm", arguments.toMutableList(), options)
}
