package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ParagraphSpacing
 *
 * Full name:        System`ParagraphSpacing
 *
 * Usage:            ParagraphSpacing is an option for Cell, StyleBox, and Style that specifies how much extra space to leave between successive paragraphs of text.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParagraphSpacing
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParagraphSpacing.html
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
fun paragraphSpacing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParagraphSpacing", arguments.toMutableList(), options)
}
