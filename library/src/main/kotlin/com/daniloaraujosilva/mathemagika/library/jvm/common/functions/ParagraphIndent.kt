package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ParagraphIndent
 *
 * Full name:        System`ParagraphIndent
 *
 * Usage:            ParagraphIndent is an option for Cell which specifies how far in printer's points to indent the first line of each paragraph of text.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParagraphIndent
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParagraphIndent.html
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
fun paragraphIndent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParagraphIndent", arguments.toMutableList(), options)
}
