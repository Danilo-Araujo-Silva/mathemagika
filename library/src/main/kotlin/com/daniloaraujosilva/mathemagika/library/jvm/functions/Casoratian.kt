package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Casoratian
 *
 * Full name:        System`Casoratian
 *
 *                   Casoratian[{y , y , …}, n] gives the Casoratian determinant for the sequences y , y , … depending on n.
 *                                1   2                                                             1   2
 *                   Casoratian[eqn, y, n] gives the Casoratian determinant for the basis of the solutions of the linear difference equation eqn involving y[n + m].
 *                   Casoratian[eqns, {y , y , …}, n] gives the Casoratian determinant for the system of linear difference equations eqns.
 * Usage:                               1   2
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Casoratian
 * Documentation:    web: http://reference.wolfram.com/language/ref/Casoratian.html
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
fun casoratian(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Casoratian", arguments.toMutableList(), options)
}
