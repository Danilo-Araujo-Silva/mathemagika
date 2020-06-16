package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DirichletLambda
 *
 * Full name:        System`DirichletLambda
 *
 * Usage:            DirichletLambda[s] gives the Dirichlet lambda function λ(s).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DirichletLambda
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirichletLambda.html
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
fun dirichletLambda(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirichletLambda", arguments.toMutableList(), options)
}
