package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Im
 *
 * Full name:        System`Im
 *
 * Usage:            Im[z] gives the imaginary part of the complex number z.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Im
 * Documentation:    web: http://reference.wolfram.com/language/ref/Im.html
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
fun im(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Im", arguments.toMutableList(), options)
}
