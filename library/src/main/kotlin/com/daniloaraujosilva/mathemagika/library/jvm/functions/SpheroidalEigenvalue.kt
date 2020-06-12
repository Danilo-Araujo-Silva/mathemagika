package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SpheroidalEigenvalue
 *
 * Full name:        System`SpheroidalEigenvalue
 *
 * Usage:            SpheroidalEigenvalue[n, m, γ] gives the spheroidal eigenvalue with degree n and order m.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpheroidalEigenvalue
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalEigenvalue.html
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
fun spheroidalEigenvalue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalEigenvalue", arguments.toMutableList(), options)
}
