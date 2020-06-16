package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SpheroidalRadialFactor
 *
 * Full name:        System`SpheroidalRadialFactor
 *
 * Usage:            SpheroidalRadialFactor[n, m, c] gives the spheroidal radial factor with degree n and order m.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SpheroidalRadialFactor
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpheroidalRadialFactor.html
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
fun spheroidalRadialFactor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpheroidalRadialFactor", arguments.toMutableList(), options)
}
