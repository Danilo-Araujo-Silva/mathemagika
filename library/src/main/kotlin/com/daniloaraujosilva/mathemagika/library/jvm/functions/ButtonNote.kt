package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ButtonNote
 *
 * Full name:        System`ButtonNote
 *
 * Usage:            ButtonNote is an option for ButtonBox that specifies what should be displayed in the status line of the current notebook window when the button is active and the cursor is placed on top of it.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ButtonNote
 * Documentation:    web: http://reference.wolfram.com/language/ref/ButtonNote.html
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
fun buttonNote(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ButtonNote", arguments.toMutableList(), options)
}
