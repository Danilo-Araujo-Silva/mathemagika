package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StyleDefinitions
 *
 * Full name:        System`StyleDefinitions
 *
 * Usage:            StyleDefinitions is an option for notebooks that gives definitions for the styles that can be used in a notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StyleDefinitions
 * Documentation:    web: http://reference.wolfram.com/language/ref/StyleDefinitions.html
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
fun styleDefinitions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StyleDefinitions", arguments.toMutableList(), options)
}
