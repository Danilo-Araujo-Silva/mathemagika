package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KelvinBer
 *
 * Full name:        System`KelvinBer
 *
 *                   KelvinBer[z] gives the Kelvin function ber(z).
 *                   KelvinBer[n, z] gives the Kelvin function ber (z).
 * Usage:                                                         n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KelvinBer
 * Documentation:    web: http://reference.wolfram.com/language/ref/KelvinBer.html
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
fun kelvinBer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KelvinBer", arguments.toMutableList(), options)
}
