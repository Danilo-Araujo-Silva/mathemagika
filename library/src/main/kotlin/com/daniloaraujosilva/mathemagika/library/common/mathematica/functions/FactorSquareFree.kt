package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FactorSquareFree
 *
 * Full name:        System`FactorSquareFree
 *
 * Usage:            FactorSquareFree[poly] pulls out any multiple factors in a polynomial.
 *
 *                   Extension -> None
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FactorSquareFree
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorSquareFree.html
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
fun factorSquareFree(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorSquareFree", arguments.toMutableList(), options)
}
