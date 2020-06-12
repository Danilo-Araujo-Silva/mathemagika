package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HelpBrowserSettings
 *
 * Full name:        System`HelpBrowserSettings
 *
 * Usage:            HelpBrowserSettings is a global option that specifies settings for the legacy Help Browser.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HelpBrowserSettings
 * Documentation:    web: http://reference.wolfram.com/language/ref/HelpBrowserSettings.html
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
fun helpBrowserSettings(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HelpBrowserSettings", arguments.toMutableList(), options)
}
