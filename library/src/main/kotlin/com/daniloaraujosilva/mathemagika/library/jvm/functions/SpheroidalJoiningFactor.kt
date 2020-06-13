package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SpheroidalJoiningFactor
 *
 * Full name:        System`SpheroidalJoiningFactor
 *
 * Usage:            SpheroidalJoiningFactor[n, m, γ] gives the spheroidal joining factor with degree n and order m.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpheroidalJoiningFactor
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalJoiningFactor.html
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
fun spheroidalJoiningFactor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalJoiningFactor", arguments.toMutableList(), options)
}
