package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NotebookConvertSettings
 *
 * Full name:        System`NotebookConvertSettings
 *
 * Usage:            NotebookConvertSettings is a global option that specifies settings for converting imported legacy notebooks.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NotebookConvertSettings
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotebookConvertSettings.html
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
fun notebookConvertSettings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotebookConvertSettings", arguments.toMutableList(), options)
}
