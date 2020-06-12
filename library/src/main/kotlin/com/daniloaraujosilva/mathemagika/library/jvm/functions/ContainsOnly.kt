package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContainsOnly
 *
 * Full name:        System`ContainsOnly
 *
 *                   ContainsOnly[e , e ] yields True if e  contains only elements that appear in e .
 *                                 1   2                  1                                        2
 *                   ContainsOnly[e ] is an operator form that yields True when the object to which it is applied contains only elements that appear in e .
 * Usage:                          2                                                                                                                     2
 *
 * Options:          SameTest -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ContainsOnly
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContainsOnly.html
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
fun containsOnly(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContainsOnly", arguments.toMutableList(), options)
}
