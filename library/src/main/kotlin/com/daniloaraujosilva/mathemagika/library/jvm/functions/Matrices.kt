package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Matrices
 *
 * Full name:        System`Matrices
 *
 *                   Matrices[{d , d }] represents the domain of matrices of dimensions d ×d .
 *                              1   2                                                    1  2
 *                   Matrices[{d , d }, dom] represents the domain of matrices of dimensions d ×d , with components in the domain dom.
 *                              1   2                                                         1  2
 *                   Matrices[{d , d }, dom, sym] represents the subdomain of matrices d ×d  with symmetry sym.
 * Usage:                       1   2                                                   1  2
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Matrices
 * Documentation:    web: http://reference.wolfram.com/language/ref/Matrices.html
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
fun matrices(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Matrices", arguments.toMutableList(), options)
}
