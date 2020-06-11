package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SatisfiabilityCount
 *
 * Full name:        System`SatisfiabilityCount
 *
 *                   SatisfiabilityCount[bf] counts the number of possible combinations of variable values that yield True when supplied as arguments to the Boolean function bf.
 *                   SatisfiabilityCount[expr, {a , a , …}] counts the number of possible combinations of the a  that make the Boolean expression expr be true.
 * Usage:                                        1   2                                                         i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SatisfiabilityCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/SatisfiabilityCount.html
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
fun satisfiabilityCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SatisfiabilityCount", arguments.toMutableList(), options)
}
