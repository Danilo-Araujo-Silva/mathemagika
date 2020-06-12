package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AutoItalicWords
 *
 * Full name:        System`AutoItalicWords
 *
 * Usage:            AutoItalicWords is an option for Cell that gives a list of words that should automatically be put in italics when they are entered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoItalicWords
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoItalicWords.html
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
fun autoItalicWords(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoItalicWords", arguments.toMutableList(), options)
}
