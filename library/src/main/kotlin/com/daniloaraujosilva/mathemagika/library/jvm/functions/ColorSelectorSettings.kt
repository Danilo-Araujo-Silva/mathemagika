package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ColorSelectorSettings
 *
 * Full name:        System`ColorSelectorSettings
 *
 * Usage:            ColorSelectorSettings is a global option that specifies settings for the Color dialog box.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ColorSelectorSettings
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorSelectorSettings.html
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
fun colorSelectorSettings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorSelectorSettings", arguments.toMutableList(), options)
}
