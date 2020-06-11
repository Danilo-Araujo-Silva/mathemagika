package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AppearanceRules
 *
 * Full name:        System`AppearanceRules
 *
 * Usage:            AppearanceRules is an option for form and page generation functions that specifies the overall appearance of the generated object.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AppearanceRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/AppearanceRules.html
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
fun appearanceRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AppearanceRules", arguments.toMutableList(), options)
}
