package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Pochhammer
 *
 * Full name:        System`Pochhammer
 *
 *                   Pochhammer[a, n] gives the Pochhammer symbol (a) .
 * Usage:                                                            n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Pochhammer
 * Documentation:    web: http://reference.wolfram.com/language/ref/Pochhammer.html
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
fun pochhammer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Pochhammer", arguments.toMutableList(), options)
}
