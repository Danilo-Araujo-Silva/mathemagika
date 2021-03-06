package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SyntaxPacket
 *
 * Full name:        System`SyntaxPacket
 *
 * Usage:            SyntaxPacket[integer] is a WSTP packet where integer indicates the position at which a syntax error was detected in the input line.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SyntaxPacket
 * Documentation:    web: http://reference.wolfram.com/language/ref/SyntaxPacket.html
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
fun syntaxPacket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SyntaxPacket", arguments.toMutableList(), options)
}
