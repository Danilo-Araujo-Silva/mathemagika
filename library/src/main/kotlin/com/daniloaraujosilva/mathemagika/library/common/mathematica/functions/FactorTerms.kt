package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FactorTerms
 *
 * Full name:        System`FactorTerms
 *
 *                   FactorTerms[poly] pulls out any overall numerical factor in poly.
 *                   FactorTerms[poly, x] pulls out any overall factor in poly that does not depend on x.
 *                   FactorTerms[poly, {x , x , …}] pulls out any overall factor in poly that does not depend on any of the x .
 * Usage:                                1   2                                                                               i
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FactorTerms
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorTerms.html
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
fun factorTerms(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorTerms", arguments.toMutableList(), options)
}
