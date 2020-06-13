package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CoxianDistribution
 *
 * Full name:        System`CoxianDistribution
 *
 *                   CoxianDistribution[{α , …, α     }, {λ , …, λ }] represent an m-phase Coxian distribution with phase probabilities α  and rates λ .
 * Usage:                                 1      m - 1     1      m                                                                      i            i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CoxianDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoxianDistribution.html
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
fun coxianDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoxianDistribution", arguments.toMutableList(), options)
}
