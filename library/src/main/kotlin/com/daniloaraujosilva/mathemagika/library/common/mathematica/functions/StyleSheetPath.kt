package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StyleSheetPath
 *
 * Full name:        System`StyleSheetPath
 *
 * Usage:            StyleSheetPath is a global option that specifies which directories the Wolfram System searches to find stylesheets.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StyleSheetPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/StyleSheetPath.html
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
fun styleSheetPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StyleSheetPath", arguments.toMutableList(), options)
}
