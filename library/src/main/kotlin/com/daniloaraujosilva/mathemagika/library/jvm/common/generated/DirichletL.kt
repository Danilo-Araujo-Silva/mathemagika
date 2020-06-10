package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DirichletL
 * 
 * Full name:        System`DirichletL
 * 
 * Usage:            DirichletL[k, j, s] gives the Dirichlet L-function L(χ, s) for the Dirichlet character χ(n) with modulus k and index j.
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DirichletL
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirichletL.html
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
fun dirichletL(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirichletL", arguments.toMutableList(), options)
}
