package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DirichletDistribution
 *
 * Full name:        System`DirichletDistribution
 *
 *                   DirichletDistribution[{α , …, α     }] represents a Dirichlet distribution of dimension k with shape parameters α .
 * Usage:                                    1      k + 1                                                                             i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DirichletDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirichletDistribution.html
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
fun dirichletDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirichletDistribution", arguments.toMutableList(), options)
}
