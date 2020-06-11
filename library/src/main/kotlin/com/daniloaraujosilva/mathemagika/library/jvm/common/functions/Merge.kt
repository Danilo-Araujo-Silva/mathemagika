package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Merge
 *
 * Full name:        System`Merge
 *
 *                   Merge[{assoc , assoc , …}, f] merges the associations assoc , using the function f to combine values with the same key.
 *                               1       2                                      i
 *                   Merge[{key   val , key   val , …}, f] gives an association in which values corresponding to identical keys are combined using f.
 *                             1      1     2      2
 * Usage:            Merge[f] represents an operator form of Merge that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Merge
 * Documentation:    web: http://reference.wolfram.com/language/ref/Merge.html
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
fun merge(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Merge", arguments.toMutableList(), options)
}
