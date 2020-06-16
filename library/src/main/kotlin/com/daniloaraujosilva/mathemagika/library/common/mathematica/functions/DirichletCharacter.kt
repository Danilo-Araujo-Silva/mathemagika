package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DirichletCharacter
 *
 * Full name:        System`DirichletCharacter
 *
 *                   DirichletCharacter[k, j, n] gives the Dirichlet character χ      (n) with modulus k and index j.
 * Usage:                                                                       {k, j}
 *
 * Options:          None
 *
 *                   Listable
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DirichletCharacter
 * Documentation:    web: http://reference.wolfram.com/language/ref/DirichletCharacter.html
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
fun dirichletCharacter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DirichletCharacter", arguments.toMutableList(), options)
}
