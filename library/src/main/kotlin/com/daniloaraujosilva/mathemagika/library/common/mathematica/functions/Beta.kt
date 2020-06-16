package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Beta
 *
 * Full name:        System`Beta
 *
 *                   Beta[a, b] gives the Euler beta function Β(a, b).
 *                   Beta[z, a, b] gives the incomplete beta function Β (a, b).
 * Usage:                                                              z
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Beta
 * Documentation:    web: http://reference.wolfram.com/language/ref/Beta.html
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
fun beta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Beta", arguments.toMutableList(), options)
}
