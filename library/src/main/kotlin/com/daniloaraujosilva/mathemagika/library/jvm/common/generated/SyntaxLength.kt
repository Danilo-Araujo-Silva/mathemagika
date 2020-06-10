package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SyntaxLength
 * 
 * Full name:        System`SyntaxLength
 * 
 * Usage:            SyntaxLength["string"] finds the number of characters starting at the beginning of a string that correspond to syntactically correct input for a single Wolfram Language expression. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SyntaxLength
 * Documentation:    web: http://reference.wolfram.com/language/ref/SyntaxLength.html
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
fun syntaxLength(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SyntaxLength", arguments.toMutableList(), options)
}
