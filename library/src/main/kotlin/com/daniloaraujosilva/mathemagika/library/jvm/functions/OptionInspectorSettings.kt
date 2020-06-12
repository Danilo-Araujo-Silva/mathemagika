package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OptionInspectorSettings
 *
 * Full name:        System`OptionInspectorSettings
 *
 * Usage:            OptionInspectorSettings is a global option that specifies the display of options in the Option Inspector.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OptionInspectorSettings
 * Documentation:    web: http://reference.wolfram.com/language/ref/OptionInspectorSettings.html
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
fun optionInspectorSettings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OptionInspectorSettings", arguments.toMutableList(), options)
}
