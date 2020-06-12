package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Laplacian
 *
 * Full name:        System`Laplacian
 *
 *                                                                  2       2        2       2
 *                   Laplacian[f, {x , …, x }] gives the Laplacian ∂  f/∂ x   + … + ∂  f/∂ x  .
 *                                  1      n                               1                n
 *                   Laplacian[f, {x , …, x }, chart] gives the Laplacian in the given coordinates chart.
 * Usage:                           1      n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Laplacian
 * Documentation:    web: http://reference.wolfram.com/language/ref/Laplacian.html
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
fun laplacian(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Laplacian", arguments.toMutableList(), options)
}
