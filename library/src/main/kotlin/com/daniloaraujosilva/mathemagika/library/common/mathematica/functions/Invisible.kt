package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Invisible
 *
 * Full name:        System`Invisible
 *
 * Usage:            Invisible[expr] displays as space that is the same size as the formatted version of expr.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Invisible
 * Documentation:    web: http://reference.wolfram.com/language/ref/Invisible.html
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
fun invisible(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Invisible", arguments.toMutableList(), options)
}
