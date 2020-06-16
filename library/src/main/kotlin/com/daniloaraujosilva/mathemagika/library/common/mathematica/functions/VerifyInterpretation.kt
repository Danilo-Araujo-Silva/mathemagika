package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VerifyInterpretation
 *
 * Full name:        System`VerifyInterpretation
 *
 * Usage:            VerifyInterpretation is an option for TextCases, TextPosition and TextContents that verifies that results can be interpreted using Interpreter and related functions and drops those that cannot.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/VerifyInterpretation
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerifyInterpretation.html
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
fun verifyInterpretation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerifyInterpretation", arguments.toMutableList(), options)
}
