package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InputForm
 * 
 * Full name:        System`InputForm
 * 
 * Usage:            InputForm[expr] prints as a version of expr suitable for input to the Wolfram Language. 
 * 
 * Options:          NumberMarks :> $NumberMarks
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/InputForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/InputForm.html
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
fun inputForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InputForm", arguments.toMutableList(), options)
}
