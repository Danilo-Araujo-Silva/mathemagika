package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AnnuityDue
 *
 * Full name:        System`AnnuityDue
 *
 *                   AnnuityDue[p, t] represents an annuity due of fixed payments p made over t periods.
 *                   AnnuityDue[p, t, q] represents a series of payments occurring at time intervals q.
 *                   AnnuityDue[{p, {p       , p     }}, t, q] represents an annuity due with the specified initial and final payments.
 * Usage:                             initial   final
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AnnuityDue
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnnuityDue.html
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
fun annuityDue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnnuityDue", arguments.toMutableList(), options)
}
