package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WrapAround
 *
 * Full name:        System`WrapAround
 *
 * Usage:            WrapAround is an option for NotebookFind that specifies whether the find operation should continue past the bottom or top of a document.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WrapAround
 * Documentation:    web: http://reference.wolfram.com/language/ref/WrapAround.html
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
fun wrapAround(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WrapAround", arguments.toMutableList(), options)
}
