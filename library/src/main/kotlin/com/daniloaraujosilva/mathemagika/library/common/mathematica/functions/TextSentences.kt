package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TextSentences
 *
 * Full name:        System`TextSentences
 *
 *                   TextSentences["string"] gives a list of the runs of characters identified as sentences in string.
 * Usage:            TextSentences["string", n] gives the first n sentences in string.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TextSentences
 * Documentation:    web: http://reference.wolfram.com/language/ref/TextSentences.html
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
fun textSentences(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TextSentences", arguments.toMutableList(), options)
}
