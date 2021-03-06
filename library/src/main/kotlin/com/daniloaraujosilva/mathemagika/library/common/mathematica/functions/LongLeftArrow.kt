package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LongLeftArrow
 *
 * Full name:        System`LongLeftArrow
 *
 * Usage:            LongLeftArrow[x, y, …] displays as x ⟵ y ⟵ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/LongLeftArrow
 * Documentation:    web: http://reference.wolfram.com/language/ref/LongLeftArrow.html
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
fun longLeftArrow(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LongLeftArrow", arguments.toMutableList(), options)
}
