package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KelvinKer
 *
 * Full name:        System`KelvinKer
 *
 *                   KelvinKer[z] gives the Kelvin function ker(z).
 *                   KelvinKer[n, z] gives the Kelvin function ker (z).
 * Usage:                                                         n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KelvinKer
 * Documentation:    web: http://reference.wolfram.com/language/ref/KelvinKer.html
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
fun kelvinKer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KelvinKer", arguments.toMutableList(), options)
}
