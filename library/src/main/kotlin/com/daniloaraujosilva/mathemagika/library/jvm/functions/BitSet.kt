package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BitSet
 *
 * Full name:        System`BitSet
 *
 *                                                                                       k
 * Usage:            BitSet[n, k] sets to 1 the bit corresponding to the coefficient of 2  in the integer n.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BitSet
 * Documentation:    web: http://reference.wolfram.com/language/ref/BitSet.html
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
fun bitSet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BitSet", arguments.toMutableList(), options)
}
