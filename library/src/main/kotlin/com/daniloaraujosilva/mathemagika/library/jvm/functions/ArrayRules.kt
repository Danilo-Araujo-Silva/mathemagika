package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ArrayRules
 *
 * Full name:        System`ArrayRules
 *
 *                   ArrayRules[SparseArray[…]] gives the rules {pos   val , pos   val , …} specifying elements in a sparse array.
 *                                                                  1      1     2      2
 * Usage:            ArrayRules[list] gives rules for SparseArray[list].
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ArrayRules
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArrayRules.html
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
fun arrayRules(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArrayRules", arguments.toMutableList(), options)
}
