package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UndoOptions
 *
 * Full name:        System`UndoOptions
 *
 * Usage:            UndoOptions is an option for Style that specifies settings for controlling the behavior of the front end's interactive undo/redo system.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/UndoOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/UndoOptions.html
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
fun undoOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UndoOptions", arguments.toMutableList(), options)
}
