package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SemialgebraicComponentInstances
 * 
 * Full name:        System`SemialgebraicComponentInstances
 * 
 *                   SemialgebraicComponentInstances[ineqs, {x , x , …}] gives at least one sample point in each connected component of the semialgebraic set defined by the inequalities ineqs in the variables x , x , ….
 * Usage:                                                     1   2                                                                                                                                               1   2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SemialgebraicComponentInstances
 * Documentation:    web: http://reference.wolfram.com/language/ref/SemialgebraicComponentInstances.html
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
fun semialgebraicComponentInstances(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SemialgebraicComponentInstances", arguments.toMutableList(), options)
}
