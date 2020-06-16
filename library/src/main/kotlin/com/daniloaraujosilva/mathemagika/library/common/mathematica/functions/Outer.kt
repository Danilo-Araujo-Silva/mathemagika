package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Outer
 *
 * Full name:        System`Outer
 *
 *                   Outer[f, list , list , …] gives the generalized outer product of the list , forming all possible combinations of the lowest‐level elements in each of them, and feeding them as arguments to f.
 *                                1      2                                                    i
 *                   Outer[f, list , list , …, n] treats as separate elements only sublists at level n in the list .
 *                                1      2                                                                        i
 *                   Outer[f, list , list , …, n , n , …] treats as separate elements only sublists at level n  in the corresponding list .
 * Usage:                         1      2      1   2                                                         i                          i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Outer
 * Documentation:    web: http://reference.wolfram.com/language/ref/Outer.html
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
fun outer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Outer", arguments.toMutableList(), options)
}
