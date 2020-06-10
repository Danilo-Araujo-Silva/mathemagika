package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NSolve
 * 
 * Full name:        System`NSolve
 * 
 *                   NSolve[expr, vars] attempts to find numerical approximations to the solutions of the system expr of equations or inequalities for the variables vars. 
 * Usage:            NSolve[expr, vars, Reals] finds solutions over the domain of real numbers.
 * 
 *                   Method -> Automatic
 *                   RandomSeeding -> 1234
 *                   VerifySolutions -> Automatic
 * Options:          WorkingPrecision -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/NSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/NSolve.html
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
fun nSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NSolve", arguments.toMutableList(), options)
}
