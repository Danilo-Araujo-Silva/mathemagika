package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HeaderBackground
 *
 * Full name:        System`HeaderBackground
 *
 * Usage:            HeaderBackground is an option for Dataset that specifies what background color to use for row and column headers.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HeaderBackground
 * Documentation:    web: http://reference.wolfram.com/language/ref/HeaderBackground.html
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
fun headerBackground(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HeaderBackground", arguments.toMutableList(), options)
}
