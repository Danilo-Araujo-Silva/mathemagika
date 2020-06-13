package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SyntaxQ
 *
 * Full name:        System`SyntaxQ
 *
 *                   SyntaxQ["string"] returns True if the string corresponds to syntactically correct input for a single Wolfram Language expression, and returns False otherwise.
 * Usage:            SyntaxQ["string", form] uses interpretation rules corresponding to the specified form.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SyntaxQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/SyntaxQ.html
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
fun syntaxQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SyntaxQ", arguments.toMutableList(), options)
}
