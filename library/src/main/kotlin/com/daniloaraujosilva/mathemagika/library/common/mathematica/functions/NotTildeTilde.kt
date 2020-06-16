package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NotTildeTilde
 *
 * Full name:        System`NotTildeTilde
 *
 * Usage:            NotTildeTilde[x, y, …] displays as x ≉ y ≉ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/NotTildeTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotTildeTilde.html
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
fun notTildeTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotTildeTilde", arguments.toMutableList(), options)
}
