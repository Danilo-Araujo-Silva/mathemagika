package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteStopwords
 *
 * Full name:        System`DeleteStopwords
 *
 *                   DeleteStopwords[list] deletes stopwords from a list of words.
 *                   DeleteStopwords["string"] deletes stopwords from a string.
 *                   DeleteStopwords[{string , string , …}] deletes stopwords from a list of strings.
 * Usage:                                   1        2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeleteStopwords
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteStopwords.html
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
fun deleteStopwords(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteStopwords", arguments.toMutableList(), options)
}
