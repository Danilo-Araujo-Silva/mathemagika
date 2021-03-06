package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ReverseUpEquilibrium
 *
 * Full name:        System`ReverseUpEquilibrium
 *
 * Usage:            ReverseUpEquilibrium[x, y, …] displays as x ⥯ y ⥯ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/ReverseUpEquilibrium
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReverseUpEquilibrium.html
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
fun reverseUpEquilibrium(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReverseUpEquilibrium", arguments.toMutableList(), options)
}
