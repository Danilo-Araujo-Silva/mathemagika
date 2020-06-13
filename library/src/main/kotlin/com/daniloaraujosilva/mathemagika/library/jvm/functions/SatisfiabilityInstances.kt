package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SatisfiabilityInstances
 *
 * Full name:        System`SatisfiabilityInstances
 *
 *                   SatisfiabilityInstances[bf] attempts to find a choice of variables that makes the Boolean function bf yield True.
 *                   SatisfiabilityInstances[expr, {a , a , …}] attempts to find a choice of the a  that makes the Boolean expression expr be True.
 *                                                   1   2                                        i
 * Usage:            SatisfiabilityInstances[b, …, m] attempts to find m choices of variables that yield True.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SatisfiabilityInstances
 * Documentation:    web: http://reference.wolfram.com/language/ref/SatisfiabilityInstances.html
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
fun satisfiabilityInstances(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SatisfiabilityInstances", arguments.toMutableList(), options)
}
