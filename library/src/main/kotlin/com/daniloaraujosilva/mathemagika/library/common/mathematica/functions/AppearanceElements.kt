package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AppearanceElements
 *
 * Full name:        System`AppearanceElements
 *
 * Usage:            AppearanceElements is an option for functions like Manipulate that specifies what elements should be included in the displayed form of the object generated.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AppearanceElements
 * Documentation:    web: http://reference.wolfram.com/language/ref/AppearanceElements.html
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
fun appearanceElements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AppearanceElements", arguments.toMutableList(), options)
}
