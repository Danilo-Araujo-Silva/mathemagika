package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Annuity
 * 
 * Full name:        System`Annuity
 * 
 *                   Annuity[p, t] represents an annuity of fixed payments p made over t periods.
 *                   Annuity[p, t, q] represents a series of payments occurring at time intervals q.
 *                   Annuity[{p, {p       , p     }}, t, q] represents an annuity with the specified initial and final payments.
 * Usage:                          initial   final
 * 
 * Options:          AnnuityType -> Immediate
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Annuity
 * Documentation:    web: http://reference.wolfram.com/language/ref/Annuity.html
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
fun annuity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Annuity", arguments.toMutableList(), options)
}
