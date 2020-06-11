package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WordData
 *
 * Full name:        System`WordData
 *
 *                   WordData["word", "property"] gives the specified property for the English word "word".
 *                   WordData["word"] gives a list of full word specifications representing possible uses and senses of "word".
 * Usage:            WordData[wordspec, "property"] gives a property for a particular word specification.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WordData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WordData.html
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
fun wordData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WordData", arguments.toMutableList(), options)
}
