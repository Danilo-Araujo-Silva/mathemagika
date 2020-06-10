package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Wronskian
 * 
 * Full name:        System`Wronskian
 * 
 *                   Wronskian[{y , y , …}, x] gives the Wronskian determinant for the functions y , y , … depending on x.
 *                               1   2                                                            1   2
 *                   Wronskian[eqn, y, x] gives the Wronskian determinant for the basis of the solutions of the linear differential equation eqn with dependent variable y and independent variable x. 
 *                   Wronskian[eqns, {y , y , …}, x] gives the Wronskian determinant for the system of linear differential equations eqns.
 * Usage:                              1   2
 * 
 * Options:          Assumptions :> $Assumptions
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Wronskian
 * Documentation:    web: http://reference.wolfram.com/language/ref/Wronskian.html
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
fun wronskian(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Wronskian", arguments.toMutableList(), options)
}
