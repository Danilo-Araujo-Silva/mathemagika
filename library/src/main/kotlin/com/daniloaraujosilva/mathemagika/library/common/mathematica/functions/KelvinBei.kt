package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             KelvinBei
 *
 * Full name:        System`KelvinBei
 *
 *                   KelvinBei[z] gives the Kelvin function bei(z).
 *                   KelvinBei[n, z] gives the Kelvin function bei (z).
 * Usage:                                                         n
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KelvinBei
 * Documentation:    web: http://reference.wolfram.com/language/ref/KelvinBei.html
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
fun kelvinBei(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KelvinBei", arguments.toMutableList(), options)
}
