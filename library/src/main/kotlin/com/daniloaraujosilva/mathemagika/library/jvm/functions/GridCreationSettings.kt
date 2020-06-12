package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GridCreationSettings
 *
 * Full name:        System`GridCreationSettings
 *
 * Usage:            GridCreationSettings is a global option that specifies settings for the Create Table/Matrix dialog.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GridCreationSettings
 * Documentation:    web: http://reference.wolfram.com/language/ref/GridCreationSettings.html
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
fun gridCreationSettings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GridCreationSettings", arguments.toMutableList(), options)
}
