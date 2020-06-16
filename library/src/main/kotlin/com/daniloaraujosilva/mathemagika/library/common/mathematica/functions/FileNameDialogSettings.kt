package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FileNameDialogSettings
 *
 * Full name:        System`FileNameDialogSettings
 *
 * Usage:            FileNameDialogSettings is a global option that specifies settings for the Insert File Path dialog box.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FileNameDialogSettings
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileNameDialogSettings.html
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
fun fileNameDialogSettings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileNameDialogSettings", arguments.toMutableList(), options)
}
