package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SyntaxInformation
 *
 * Full name:        System`SyntaxInformation
 *
 * Usage:            SyntaxInformation[f] gives information used to generate syntax coloring and other advisories when f[…] is entered as input.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SyntaxInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/SyntaxInformation.html
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
fun syntaxInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SyntaxInformation", arguments.toMutableList(), options)
}
