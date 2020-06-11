package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 *                   StandardForm
 * Name:             TraditionalForm
 *
 *                   System`StandardForm
 * Full name:        System`TraditionalForm
 *
 *                   {StandardForm[expr] prints as the standard Wolfram Language two-dimensional representation of expr. }
 * Usage:            {TraditionalForm[expr] prints as an approximation to the traditional mathematical notation for expr. }
 *
 *                   None
 * Options:          ParameterVariables -> {}
 *
 *                   Protected                ReadProtected
 * Attributes:       Protected                ReadProtected
 *
 *                   local: <>{<|Local -> paclet:ref/StandardForm, Web -> http://reference.wolfram.com/language/ref/StandardForm.html|>, <|Local -> paclet:ref/TraditionalForm, Web -> http://reference.wolfram.com/language/ref/TraditionalForm.html|>}[Local]
 * Documentation:    web: <>{<|Local -> paclet:ref/StandardForm, Web -> http://reference.wolfram.com/language/ref/StandardForm.html|>, <|Local -> paclet:ref/TraditionalForm, Web -> http://reference.wolfram.com/language/ref/TraditionalForm.html|>}[Web]
 *
 *                   None
 * Definitions:      None
 *
 *                   None
 * Own values:       None
 *
 *                   None
 * Down values:      None
 *
 *                   None
 * Up values:        None
 *
 *                   None
 * Sub values:       None
 *
 *                   None
 * Default value:    None
 *
 *                   None
 * Numeric values:   None
 */
fun `$BoxForms`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$BoxForms", arguments.toMutableList(), options)
}
