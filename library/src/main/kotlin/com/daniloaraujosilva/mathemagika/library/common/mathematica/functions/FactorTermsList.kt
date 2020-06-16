package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FactorTermsList
 *
 * Full name:        System`FactorTermsList
 *
 *                   FactorTermsList[poly] gives a list in which the first element is the overall numerical factor in poly, and the second element is the polynomial with the overall factor removed.
 *                   FactorTermsList[poly, {x , x , …}] gives a list of factors of poly. The first element in the list is the overall numerical factor. The second element is a factor that does not depend on any of the x . Subsequent elements are factors which depend on progressively more of the x .
 * Usage:                                    1   2                                                                                                                                                                         i                                                                             i
 *
 *                   Modulus -> 0
 * Options:          Trig -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FactorTermsList
 * Documentation:    web: http://reference.wolfram.com/language/ref/FactorTermsList.html
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
fun factorTermsList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FactorTermsList", arguments.toMutableList(), options)
}
