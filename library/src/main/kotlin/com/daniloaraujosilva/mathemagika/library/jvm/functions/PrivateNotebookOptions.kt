package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PrivateNotebookOptions
 *
 * Full name:        System`PrivateNotebookOptions
 *
 * Usage:            PrivateNotebookOptions is an option for notebooks that specifies various low-level notebook settings.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrivateNotebookOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrivateNotebookOptions.html
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
fun privateNotebookOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrivateNotebookOptions", arguments.toMutableList(), options)
}