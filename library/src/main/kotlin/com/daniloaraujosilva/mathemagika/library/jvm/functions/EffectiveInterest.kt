package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EffectiveInterest
 *
 * Full name:        System`EffectiveInterest
 *
 * Usage:            EffectiveInterest[r, q] gives the effective interest rate corresponding to interest specification r, compounded at time intervals q.
 *
 * Options:          InterpolationOrder -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EffectiveInterest
 * Documentation:    web: http://reference.wolfram.com/language/ref/EffectiveInterest.html
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
fun effectiveInterest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EffectiveInterest", arguments.toMutableList(), options)
}
