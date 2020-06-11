package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EditCellTagsSettings
 *
 * Full name:        System`EditCellTagsSettings
 *
 * Usage:            EditCellTagsSettings is a global option that specifies settings for the Edit Cell Tags dialog box.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EditCellTagsSettings
 * Documentation:    web: http://reference.wolfram.com/language/ref/EditCellTagsSettings.html
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
fun editCellTagsSettings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EditCellTagsSettings", arguments.toMutableList(), options)
}
