package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DirichletTransform
 *
 * Full name:        System`DirichletTransform
 *
 * Usage:            DirichletTransform[expr, n, s] gives the Dirichlet transform of expr with respect to n.
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   Method -> Automatic
 * Options:          VerifyConvergence -> True
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DirichletTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirichletTransform.html
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
fun dirichletTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirichletTransform", arguments.toMutableList(), options)
}
