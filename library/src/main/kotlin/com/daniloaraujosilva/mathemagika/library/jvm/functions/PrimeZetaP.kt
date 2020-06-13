package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PrimeZetaP
 *
 * Full name:        System`PrimeZetaP
 *
 * Usage:            PrimeZetaP[s] gives prime zeta function P(s).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PrimeZetaP
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrimeZetaP.html
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
fun primeZetaP(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrimeZetaP", arguments.toMutableList(), options)
}
